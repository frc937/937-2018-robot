
package org.usfirst.frc.team937.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team937.robot.commands.drivetrain.TankDrive;
import org.usfirst.frc.team937.robot.subsystems.Drivetrain;
import org.usfirst.frc.team937.robot.subsystems.TopLight;
import org.usfirst.frc.team937.driverStation.Prefs;
import org.usfirst.frc.team937.driverStation.RawControllerValues;


public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static TopLight topLight;
	public static OI oi;
	public static Prefs preferences;
	
	public static RawControllerValues driverController;
	public static RawControllerValues copilotController;
	
	public static TankDrive tankDrive;
	
	public PDP pdp;
	
	public void robotInit() {
		preferences = new Prefs();
		oi = new OI();
		pdp = new PDP();
		drivetrain = new Drivetrain();
		topLight = new TopLight();
		
		//init
		pdp.init();
		Drivetrain.init();
	}

	public void disabledInit() {

	}

	public void disabledPeriodic() {
		
	}

	public void autonomousInit() {
		
	}

	public void autonomousPeriodic() {
		
	}

	public void teleopInit() {
		
	}

	public void teleopPeriodic() {
		driverController = new RawControllerValues(OI.driverController);
		copilotController = new RawControllerValues(OI.copilotController);
		
		Drivetrain.updateSensors();
		
		pdp.updateValues();
		
		Scheduler.getInstance().run();
	}

	public void testPeriodic() {
		
	}
}
