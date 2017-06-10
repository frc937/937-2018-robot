package org.usfirst.frc.team937.robot;

/**
 * this is where all the magic numbers are defined
 * <p>
 * a magic number is something plugged in as a parameter with no explanation of why
 */

public class RobotMap {
	
	public static int drivetrainLeftMotor1Port  = 0;
	public static int drivetrainLeftMotor2Port  = 1;
	public static int drivetrainRightMotor1Port = 2;
	public static int drivetrainRightMotor2Port = 3;
	
	public static final int drivetrainLeftMotor1PDPChannel = 15;
	public static final int drivetrainLeftMotor2PDPChannel = 14;
	public static final int drivetrainRightMotor1PDPChannel = 13;
	public static final int drivetrainRightMotor2PDPChannel = 12;
	
	public static int drivetrainLeftEncoderPort1  = 0;
	public static int drivetrainLeftEncoderPort2  = 1;
	public static int drivetrainRightEncoderPort1 = 2;
	public static int drivetrainRightEncoderPort2 = 3;
	
	// 1/20th rotation per pulse
	public static final double drivetrainLeftEncoderDistancePerPulse  = 0.05;
	public static final double drivetrainRightEncoderDistancePerPulse = 0.05;
	
	public static int    topLightPort  = 4;
	public static double topLightPower = 1.0;
	public static final int topLightPDPChannel = 11;
	
	public static final int controllerANumber     = 1;
	public static final int controllerBNumber     = 2;
	public static final int controllerXNumber     = 3;
	public static final int controllerYNumber     = 4;
	public static final int controllerLBNumber    = 5;
	public static final int controllerRBNumber    = 6;
	public static final int controllerBackNumber  = 7;
	public static final int controllerStartNumber = 8;
	public static final int controllerLSNumber    = 9;
	public static final int controllerRSNumber    = 10;
	
	public static final int controllerLeftXAxis  = 0;
	public static final int controllerLeftYAxis  = 1;
	public static final int controllerRightXAxis = 4;
	public static final int controllerRightYAxis = 5;
	
	public static final int controllerLeftTrigger   = 2;
	public static final int controllerRightTrigger  = 3;
	public static final double triggerPullThreshold = 0.7;
	
	
	public static final int controllerPOVNumber = 0;
}
