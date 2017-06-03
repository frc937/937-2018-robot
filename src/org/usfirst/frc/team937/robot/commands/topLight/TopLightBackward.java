package org.usfirst.frc.team937.robot.commands.topLight;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team937.robot.Robot;
import org.usfirst.frc.team937.robot.subsystems.TopLight;

public class TopLightBackward extends Command {
	
    public TopLightBackward() {
        requires(Robot.TopLight);
    }

    protected void initialize() {
    	setInterruptible(true);
    }

    protected void execute() {
    	TopLight.SpinBackward();
    }
    
    protected boolean isFinished() {
        return isTimedOut() || isCanceled();
    }
    
    protected void end() {
    	TopLight.Stop();
    }
}
