
package org.usfirst.frc.team937.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team937.robot.subsystems.Drivetrain;
import org.usfirst.frc.team937.robot.subsystems.TopLight;
import org.usfirst.frc.team937.driverStation.Prefs;
import org.usfirst.frc.team937.driverStation.RawControllerValues;


public class Robot extends IterativeRobot {

	public static TopLight TopLight;
	public static Drivetrain DriveTrain;
	public static OI oi;
	public static Prefs preferences;
	
	public static RawControllerValues driverController;
	public static RawControllerValues copilotController;
	
	public void robotInit() {
		preferences = new Prefs();
		oi = new OI();
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
		
		SmartDashboard.putBoolean("a pressed", driverController.a);
	}

	public void testPeriodic() {
		
	}
}
