package org.usfirst.frc.team937.robot.subsystems;

import org.usfirst.frc.team937.robot.RobotMap;
import org.usfirst.frc.team937.robot.commands.drivetrain.TankDrive;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

    private static Talon leftMotor = new Talon(RobotMap.drivetrainleftPort);
    private static Talon rightMotor = new Talon(RobotMap.drivetrainRightPort);

    public static void leftMotor(double power) {
    	leftMotor.set(power);
    }
    
    public static void rightMotor(double power) {
    	rightMotor.set(power);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new TankDrive());
    }
}
