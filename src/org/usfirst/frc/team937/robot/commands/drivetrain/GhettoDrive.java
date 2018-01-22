package org.usfirst.frc.team937.robot.commands.drivetrain;

import org.usfirst.frc.team937.robot.Robot;
import org.usfirst.frc.team937.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Ghetto drive control mode
 * <p>
 * The same drive mode as Grand Theft Auto
 * <p>
 * This mode is easiest to program and give precise control over what the robot is doing.
 * But most users find this mode difficult to control,
 * it is also very difficult to go straight.
 */
public class GhettoDrive extends Command {
	
    public GhettoDrive() {
    	// Use requires() here to declare subsystem dependencies
    	requires(Robot.drivetrain);
    }

     // Called just before this Command runs the first time
    protected void initialize() {
    	setInterruptible(true);
    	SmartDashboard.putString("Drive Mode", "Ghetto Drive");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//run motors
    	double forwardComponent = Robot.driverController.rtAxis - Robot.driverController.ltAxis;
    	Drivetrain.leftMotor(forwardComponent + Robot.driverController.leftX);
    	Drivetrain.rightMotor(forwardComponent - Robot.driverController.leftX);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isCanceled();
    }
    
    // Called once after isFinished returns true
    protected void end() {
    	//stop motors
    	Drivetrain.leftMotor(0.0);
    	Drivetrain.rightMotor(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
