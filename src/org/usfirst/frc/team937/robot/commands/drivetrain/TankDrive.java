package org.usfirst.frc.team937.robot.commands.drivetrain;

import org.usfirst.frc.team937.robot.Robot;
import org.usfirst.frc.team937.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {

	private boolean isInterrupted = false;
	
    public TankDrive() {
    	requires(Robot.DriveTrain);
    }

    protected void initialize() {
    	setInterruptible(true);
    }

    protected void execute() {
    	Drivetrain.leftMotor(0);
    	Drivetrain.rightMotor(0);
    }

    protected boolean isFinished() {
        return isCanceled() || isInterrupted;
    }

    protected void end() {
    	
    }

    protected void interrupted() {
    	isInterrupted = true;
    }
}
