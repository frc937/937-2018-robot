package org.usfirst.frc.team937.robot;

import org.usfirst.frc.team937.driverStation.Prefs;
import org.usfirst.frc.team937.robot.commands.topLight.TopLightForward;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	Joystick driverController = new Joystick(Prefs.driverControllerPort);
	Joystick copilotController = new Joystick(Prefs.copilotControllerPort);
	
	Button  driverA     = new JoystickButton(driverController, RobotMap.controllerANumber),
			driverB     = new JoystickButton(driverController, RobotMap.controllerBNumber),
			driverX     = new JoystickButton(driverController, RobotMap.controllerXNumber),
			driverY     = new JoystickButton(driverController, RobotMap.controllerYNumber),
			driverLB    = new JoystickButton(driverController, RobotMap.controllerLBNumber),
			driverRB    = new JoystickButton(driverController, RobotMap.controllerRBNumber),
			driverBack  = new JoystickButton(driverController, RobotMap.controllerBackNumber),
			driverStart = new JoystickButton(driverController, RobotMap.controllerStartNumber),
			driverLS    = new JoystickButton(driverController, RobotMap.controllerLSNumber),
			driverRS    = new JoystickButton(driverController, RobotMap.controllerRSNumber);
	
	Button  copilotA     = new JoystickButton(copilotController, RobotMap.controllerANumber),
			copilotB     = new JoystickButton(copilotController, RobotMap.controllerBNumber),
			copilotX     = new JoystickButton(copilotController, RobotMap.controllerXNumber),
			copilotY     = new JoystickButton(copilotController, RobotMap.controllerYNumber),
			copilotLB    = new JoystickButton(copilotController, RobotMap.controllerLBNumber),
			copilotRB    = new JoystickButton(copilotController, RobotMap.controllerRBNumber),
			copilotBack  = new JoystickButton(copilotController, RobotMap.controllerBackNumber),
			copilotStart = new JoystickButton(copilotController, RobotMap.controllerStartNumber),
			copilotLS    = new JoystickButton(copilotController, RobotMap.controllerLSNumber),
			copilotRS    = new JoystickButton(copilotController, RobotMap.controllerRSNumber);
	
	//top light controls
	
	//copilotA.whileHeld(new TopLightForward());
	
}
