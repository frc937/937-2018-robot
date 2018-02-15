package org.usfirst.frc.team937.robot;

import org.usfirst.frc.team937.driverStation.Prefs;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Operator Interface
 * <p>
 * set what each button does and how it does it here
 * <p>
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
/*
 * CREATING BUTTONS
 * One type of button is a joystick button which is any button on a joystick.
 * You create one by telling it which joystick it's on and which button
 * number it is.
 * Joystick stick = new Joystick(port);
 * Button button = new JoystickButton(stick, buttonNumber);
 * 
 * There are a few additional built in buttons you can use. Additionally,
 * by subclassing Button you can create custom triggers and bind those to
 * commands the same as any other Button.
 * 
 * TRIGGERING COMMANDS WITH BUTTONS
 * Once you have a button, it's trivial to bind it to a button in one of
 * three ways:
 * 
 * Start the command when the button is pressed and let it run the command
 * until it is finished as determined by it's isFinished method.
 * button.whenPressed(new ExampleCommand());
 * 
 * Run the command while the button is being held down and interrupt it once
 * the button is released.
 * button.whileHeld(new ExampleCommand());
 * 
 * Start the command when the button is released and let it run the command
 * until it is finished as determined by it's isFinished method.
 * button.whenReleased(new ExampleCommand());
 */
	
	public static Joystick driverController = new Joystick(Prefs.driverControllerPort);
	public static Joystick copilotController = new Joystick(Prefs.copilotControllerPort);
	
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
