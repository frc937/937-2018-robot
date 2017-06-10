package org.usfirst.frc.team937.robot.commands.topLight;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team937.robot.Robot;
import org.usfirst.frc.team937.robot.subsystems.TopLight;

/** Stops the top light */
public class TopLightStop extends Command {
	
    public TopLightStop() {
        requires(Robot.topLight);
    }

    protected void initialize() {
    	setInterruptible(true);
    }

    protected void execute() {
    	TopLight.Stop();
    }
    
    protected boolean isFinished() {
        return isCanceled();
    }
}
