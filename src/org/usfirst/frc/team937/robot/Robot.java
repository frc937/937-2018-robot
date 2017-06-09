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
 * 
 * I will also add an @hax in front of comments for people who know what they are doing
 * and an @noob in front of comments aimed at people who don't have much experience with this stuff.
 * 
 * Here is the link to the electronics and programming setup steps.
 * If this code is used after that link stops working please update it for future programmers.
 * http://wpilib.screenstepslive.com
 * 
 * @hax Here is the link to the WPI library API documentation
 * @noob this shows how all the robot-specific code works
 * http://first.wpi.edu/frc/roborio/release/docs/java
 * 
 * Also, in case anyone tries any funny business with this code being their intellectual property
 * I started this under the Mozilla Public License Version 2.0
 * so there is no copyright for this, it's actually copyleft (I know it sounds dumb)
 * 
 * If you don't know what a thing does (and you are still using eclipse) you can hover the mouse over something to see it
 */

package org.usfirst.frc.team937.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team937.robot.subsystems.Drivetrain;
import org.usfirst.frc.team937.robot.subsystems.TopLight;
import org.usfirst.frc.team937.driverStation.Prefs;
import org.usfirst.frc.team937.driverStation.RawControllerValues;

/*
 * Robot is the main class of the robot.
 * This is the base that everything else is run from
 * @hax it has the different methods that are called at self explanatory times
 * @noob this is where the different parts are run from
 */

public class Robot extends IterativeRobot {

	//declare global variables
	public static Drivetrain drivetrain;
	public static TopLight topLight;
	public static OI oi;
	public static Prefs preferences;
	
	public static RawControllerValues driverController;
	public static RawControllerValues copilotController;
	
	public PDP pdp;
	
	/*
	 * 
	 */
	
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

	public void testInit() {
		
	}
	
	public void testPeriodic() {
		
	}
}
