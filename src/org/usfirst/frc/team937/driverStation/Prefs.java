package org.usfirst.frc.team937.driverStation;

import org.usfirst.frc.team937.robot.RobotMap;

import edu.wpi.first.wpilibj.Preferences;

/**
 * Read preferences from driver station
 */

public class Prefs {
	
	//declare preferences
	public static int driverControllerPort;
	public static int copilotControllerPort;
	
	private Preferences preferences;

	public Prefs() {
		preferences = Preferences.getInstance();
		
		//get controller preferences
		driverControllerPort = preferences.getInt("Driver Controller Port", 0);
		copilotControllerPort = preferences.getInt("Copilot Controller Port", 1);
		
		//drivetrain
		RobotMap.drivetrainLeftMotor1Port = preferences.getInt("Left Motor 1 port", RobotMap.drivetrainLeftMotor1Port);
		RobotMap.drivetrainLeftMotor2Port = preferences.getInt("Left Motor 2 port", RobotMap.drivetrainLeftMotor2Port);
		RobotMap.drivetrainRightMotor1Port = preferences.getInt("Right Motor 1 port", RobotMap.drivetrainRightMotor1Port);
		RobotMap.drivetrainRightMotor2Port = preferences.getInt("Right Motor 2 port", RobotMap.drivetrainRightMotor2Port);
		
		RobotMap.drivetrainLeftEncoderPort1 = preferences.getInt("Left Enc port 1", RobotMap.drivetrainLeftEncoderPort1);
		RobotMap.drivetrainLeftEncoderPort2 = preferences.getInt("Left Enc port 2", RobotMap.drivetrainLeftEncoderPort2);
		RobotMap.drivetrainRightEncoderPort1 = preferences.getInt("Right Enc port 1", RobotMap.drivetrainRightEncoderPort1);
		RobotMap.drivetrainRightEncoderPort2 = preferences.getInt("Right Enc port 2", RobotMap.drivetrainRightEncoderPort2);
		
		RobotMap.driveMode = preferences.getInt("Drive Mode", RobotMap.driveMode);
		
		//top light
		RobotMap.topLightPort = preferences.getInt("Top Light Port", RobotMap.topLightPort);
	}
}
