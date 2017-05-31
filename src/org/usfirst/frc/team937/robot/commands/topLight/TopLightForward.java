package org.usfirst.frc.team937.robot.commands.topLight;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team937.robot.Robot;
import org.usfirst.frc.team937.robot.subsystems.TopLight;

public class TopLightForward extends Command {
	
    public TopLightForward() {
        requires(Robot.TopLight);
    }

    protected void initialize() {
    	setInterruptible(true);
    	TopLight.SpinForward();
    }

    protected void execute() {
    	TopLight.SpinForward();
    }
    
    protected boolean isFinished() {
        return isTimedOut() || isCanceled();
    }
    
    protected void end() {
    	TopLight.Stop();
    }
}
