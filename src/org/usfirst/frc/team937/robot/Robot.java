/*

 * Asimov's laws 
 * 
 * 1: A robot must not injure a human being or, through inaction, allow a human being to come to harm.
 * 2: A robot must obey orders given it by human beings except where such orders would conflict with the first law.
 * 3: A robot must protect its own existence as long as such protection does not conflict with the first or second law.
 */

/*
 * A few notes:
 * I am going to comment this to a point of extreme overkill.
 * This is so that anyone can just read this code, and use it.
 * That way not everyone has to suffer the same way I have reading through the WPI library documentation
 * Anyone who knows how to program should bring their floaties so they don't drown in comments
 * 
 * Here is the link to the electronics and programming setup steps.
 * If this code is used after that link stops working please update it for future programmers.
 * http://wpilib.screenstepslive.com
 * 
 * Here is the link to the WPI library API documentation
 * http://first.wpi.edu/frc/roborio/release/docs/java
 * 
 * Also, in case anyone tries any funny business with this code being their intellectual property
 * I started this under the Mozilla Public License Version 2.0
 * so there is no copyright for this, it's actually copyleft (I know it sounds dumb)
 * 
 * If you don't know what a thing does (and you are still using eclipse) you can hover the mouse over something to see it
 */

package org.usfirst.frc.team937.robot;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team937.robot.subsystems.Camera;
import org.usfirst.frc.team937.robot.subsystems.Drivetrain;
import org.usfirst.frc.team937.robot.subsystems.TopLight;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import org.usfirst.frc.team937.driverStation.Prefs;
import org.usfirst.frc.team937.driverStation.RawControllerValues;

/**
 * Main robot class
 * <p>
 * This is the main file that the rest of the code is run from
 */

public class Robot extends IterativeRobot {

   //declare global variables
	public static Prefs preferences;
	public static Drivetrain drivetrain;
	public static TopLight topLight;
	public static OI oi;
	
	public static RawControllerValues driverController;
	public static RawControllerValues copilotController;
	
	public PDP pdp;
	
	
	/**
	 * Initialize robot
	 * <p>
	 * This method is called once when the robot is turned on.
	 * <p>
	 * Code here will probably be for things like running all the startup methods
	 * for the subsystems.
	 */
	public void robotInit() {
		//instantiate
		preferences = new Prefs();
		oi = new OI();
		pdp = new PDP();
		drivetrain = new Drivetrain();
		topLight = new TopLight();
		Camera frontCamera = new Camera();
		Camera backCamera = new Camera();
		
		//initialize
		pdp.init();
		Drivetrain.init();
	}

	/**
	 * Initialize disabled mode
	 * <p>
	 * This method is called once every time the robot is disabled
	 * <p>
	 * Code here will probably be to safely stop running robot tasks
	 * so the robot doesn't eat itself alive
	 */
	public void disabledInit() {

	}

	/**
	 * Run disabled mode tasks
	 * <p>
	 * This method is called over and over as long as the robot is disabled
	 * <p>
	 * I can't think of a reason why anyone would use this,
	 * but it's still here anyway
	 */
	public void disabledPeriodic() {
		
	}

	/**
	 * Initialize autonomous
	 * <p>
	 * This method is called once at the beginning of the autonomous period
	 * <p>
	 * Code here will probably be to get the selected autonomous mode
	 * then schedule it to run
	 */
	public void autonomousInit() {
		
	}

	
    	
	/**
	 * Run autonomous tasks
	 * <p>
	 * This method is called over and over as long as the robot is in autonomous mode
	 * <p>
	 * Code in here will probably be mainly for the scheduler.
	 * Because we are using a command based structure:
	 * most of the code for autonomous should be in command groups
	 */
	public void autonomousPeriodic() {
		
	}

	
	
	
	/**
	 * Initialize teleoperated mode
	 * <p>
	 * This method is called once when user control is enabled
	 * <p>
	 * Code in here will probably be for stopping the autonomous
	 */
	public void teleopInit() {
		
	}

	/**
	 * Run teleoperated tasks
	 * <p>
	 * This method is called over and over while driver control is enabled
	 * <p>
	 * This will probably be the main area where the base methods are called from
	 */
	public void teleopPeriodic() {
		driverController = new RawControllerValues(OI.driverController);
		//copilotController = new RawControllerValues(OI.copilotController);
		
		Drivetrain.updateSensors();

        TopLight.DSUpdate();
		
		TopLight.update();
		
		pdp.updateValues();
		
		Scheduler.getInstance().run();
	}

	/**
	 * Initialize test mode
	 * <p>
	 * This method is called at the start of test mode
	 * <p>
	 * this is where you are supposed to test new code.
	 * I would probably nigger just start another branch on github for the test
	 * that way we can get it later if we decide we want it
	 */
	public void testInit() {
		
	}
	
	/**
	 * Run test mode tasks
	 * <p>
	 * This method is called over and over during test mode
	 * <p>
	 * this is where you are supposed to test new code.
	 * I would probably just start another branch on github for the test
	 * that way we can get it later if we decide we want it
	 */
	public void testPeriodic() {
		
	}
}
