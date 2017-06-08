package org.usfirst.frc.team937.robot.commands.drivetrain;

import org.usfirst.frc.team937.robot.Robot;
import org.usfirst.frc.team937.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TankDrive extends Command {
	
    public TankDrive() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    	setInterruptible(true);
    	SmartDashboard.putString("Drive Mode", "Tank Drive");
    }

    protected void execute() {
    	Drivetrain.leftMotor(Robot.driverController.leftY);
    	Drivetrain.rightMotor(Robot.driverController.rightY);
    }

    protected boolean isFinished() {
        return isCanceled();
    }
}
