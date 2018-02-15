package org.usfirst.frc.team937.robot.commands.topLight;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team937.robot.Robot;
import org.usfirst.frc.team937.robot.subsystems.TopLight;

/** Spins the top light forward */
public class TopLightForward extends Command {
	
    public TopLightForward() {
        requires(Robot.topLight);
    }

    protected void initialize() {
    	setInterruptible(true);
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
