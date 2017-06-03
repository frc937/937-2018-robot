package org.usfirst.frc.team937.robot.commands.topLight;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team937.robot.Robot;
import org.usfirst.frc.team937.robot.subsystems.TopLight;

public class TopLightStop extends Command {
	
	private boolean isInterrupted = false;
	
    public TopLightStop() {
        requires(Robot.TopLight);
    }

    protected void initialize() {
    	setInterruptible(true);
    }

    protected void execute() {
    	TopLight.Stop();
    }
    
    protected boolean isFinished() {
        return isInterrupted || isCanceled();
    }

    protected void interrupted() {
    	isInterrupted = true;
    }
}
