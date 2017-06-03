
package org.usfirst.frc.team937.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

import org.usfirst.frc.team937.robot.subsystems.Drivetrain;
import org.usfirst.frc.team937.robot.subsystems.TopLight;
import org.usfirst.frc.team937.driverStation.Prefs;


public class Robot extends IterativeRobot {

	public static TopLight TopLight;
	public static Drivetrain DriveTrain;
	public static OI oi;
	public static Prefs preferences;
	
	public static double leftXAxis;
	public static double leftYaxis;
	public static double rightXAxis;
	public static double rightYAxis;
	
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
		
	}

	public void testPeriodic() {
		
	}
}
