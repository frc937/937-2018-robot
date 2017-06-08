package org.usfirst.frc.team937.robot.subsystems;

import org.usfirst.frc.team937.robot.RobotMap;
import org.usfirst.frc.team937.robot.commands.drivetrain.ResetEncoders;
import org.usfirst.frc.team937.robot.commands.drivetrain.TankDrive;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Drivetrain extends Subsystem {

    private static Talon leftMotor1 = new Talon(RobotMap.drivetrainleftMotorPort1);
    private static Talon leftMotor2 = new Talon(RobotMap.drivetrainleftMotorPort2);
    private static Talon rightMotor1 = new Talon(RobotMap.drivetrainRightMotorPort1);
    private static Talon rightMotor2 = new Talon(RobotMap.drivetrainRightMotorPort2);
    
    private static Encoder leftEncoder = new Encoder(RobotMap.drivetrainLeftEncoderPort1,RobotMap.drivetrainLeftEncoderPort2);
    private static Encoder rightEncoder = new Encoder(RobotMap.drivetrainRightEncoderPort1,RobotMap.drivetrainRightEncoderPort2);
    
    public static void leftMotor(double power) {
    	leftMotor1.set(power);
    	leftMotor2.set(power);
    }
    
    public static void rightMotor(double power) {
    	rightMotor1.set(power);
    	rightMotor2.set(power);
    }
    
    public static int leftEncoder() {
    	return leftEncoder.get();
    }
    
    public static double leftEncoderDistance() {
    	return leftEncoder.getDistance();
    }
    
    public static int rightEncoder() {
    	return rightEncoder.get();
    }
    
    public static double rightEncoderDistance() {
    	return rightEncoder.getDistance();
    }
    
    public static void resetEncoders() {
    	leftEncoder.reset();
    	rightEncoder.reset();
    }
    
    public static void updateSensors() {
    	SmartDashboard.putData("Reset Drive Encoders", new ResetEncoders());
    	SmartDashboard.putNumber("Left Encoder",Drivetrain.leftEncoderDistance());
		SmartDashboard.putNumber("Right Encoder",Drivetrain.rightEncoderDistance());
    }
    
    public static void init() {
    	leftEncoder.setDistancePerPulse(RobotMap.drivetrainLeftEncoderDistancePerPulse);
    	leftEncoder.setReverseDirection(false);
    	rightEncoder.setDistancePerPulse(RobotMap.drivetrainRightEncoderDistancePerPulse);
    	rightEncoder.setReverseDirection(false);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new TankDrive());
    }
}
