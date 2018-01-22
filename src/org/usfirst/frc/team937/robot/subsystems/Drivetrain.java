package org.usfirst.frc.team937.robot.subsystems;

import org.usfirst.frc.team937.robot.RobotMap;
import org.usfirst.frc.team937.robot.commands.drivetrain.ResetEncoders;
import org.usfirst.frc.team937.robot.commands.drivetrain.TankDrive;
import org.usfirst.frc.team937.robot.commands.drivetrain.GhettoDrive;
import org.usfirst.frc.team937.robot.commands.drivetrain.JoystickDrive;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Drivetrain subsystem
 * <p>
 * most code for the drivetrain should be in here somewhere
 */
public class Drivetrain extends Subsystem {

	/** motor 1 in left gearbox */
    private static Talon leftMotor1 = new Talon(RobotMap.drivetrainLeftMotor1Port);
    /** motor 2 in left gearbox */
    private static Talon leftMotor2 = new Talon(RobotMap.drivetrainLeftMotor2Port);
    /** motor 1 in right gearbox */
    private static Talon rightMotor1 = new Talon(RobotMap.drivetrainRightMotor1Port);
    /** motor 2 in right gearbox */
    private static Talon rightMotor2 = new Talon(RobotMap.drivetrainRightMotor2Port);
    
    /** drivetrain left side encoder */
    private static Encoder leftEncoder = new Encoder(RobotMap.drivetrainLeftEncoderPort1,RobotMap.drivetrainLeftEncoderPort2);
    /** drivetrain right side encoder */
    private static Encoder rightEncoder = new Encoder(RobotMap.drivetrainRightEncoderPort1,RobotMap.drivetrainRightEncoderPort2);
    
    
    /**
     * power left gearbox motors
     * 
     * @param power
     * the power supplied to the motors
     * <p>
     * a decimal between -1 and 1 inclusive
     */
    public static void leftMotor(double power) {
    	leftMotor1.set(power);
    	leftMotor2.set(power);
    }
    
    /**
     * power right gearbox motors
     * 
     * @param power
     * the power supplied to the motors
     * <p>
     * a decimal between -1 and 1 inclusive
     */
    public static void rightMotor(double power) {
    	rightMotor1.set(power);
    	rightMotor2.set(power);
    }
    
    /**
     * read left side encoder
     * 
     * @return raw ticks from left side encoder
     */
    public static int leftEncoder() {
    	return leftEncoder.get();
    }
    
    /**
     * read left side encoder
     * 
     * @return adjusted encoder distance
     */
    public static double leftEncoderDistance() {
    	return leftEncoder.getDistance();
    }
    
    /**
     * read left side encoder
     * 
     * @return raw ticks from left side encoder
     */
    public static int rightEncoder() {
    	return rightEncoder.get();
    }
    
    /**
     * read left side encoder
     * 
     * @return adjusted encoder distance
     */
    public static double rightEncoderDistance() {
    	return rightEncoder.getDistance();
    }
    
    /** zeroes drivetrain encoder count at current position */
    public static void resetEncoders() {
    	leftEncoder.reset();
    	rightEncoder.reset();
    }
    
    /** update sensor values sent to the driver station */
    public static void updateSensors() {
    	SmartDashboard.putData("Reset Drive Encoders", new ResetEncoders());
    	SmartDashboard.putNumber("Left Encoder",Drivetrain.leftEncoderDistance());
		SmartDashboard.putNumber("Right Encoder",Drivetrain.rightEncoderDistance());
    }
    
    /** initialize drivetrain stuff */
    public static void init() {
    	leftMotor1.setInverted(false);
    	leftMotor2.setInverted(false);
    	rightMotor1.setInverted(true);
    	rightMotor2.setInverted(true);
    	leftEncoder.setDistancePerPulse(RobotMap.drivetrainLeftEncoderDistancePerPulse);
    	leftEncoder.setReverseDirection(false);
    	rightEncoder.setDistancePerPulse(RobotMap.drivetrainRightEncoderDistancePerPulse);
    	rightEncoder.setReverseDirection(true);
    }
    
    public void initDefaultCommand() {
        switch (RobotMap.driveMode) {
        case 0:
        	setDefaultCommand(new TankDrive());
        break;
        case 1: 
        	setDefaultCommand(new GhettoDrive());
        break;
        case 2:
        	setDefaultCommand(new JoystickDrive());
        break;
        default:
        	setDefaultCommand(new TankDrive());
        }
    }
}
