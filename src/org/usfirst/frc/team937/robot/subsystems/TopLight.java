package org.usfirst.frc.team937.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team937.robot.RobotMap;
import org.usfirst.frc.team937.robot.commands.topLight.*;

public class TopLight extends Subsystem {

	private static Talon motor = new Talon(RobotMap.topLightPort);
	
    public static void spinForward() {
    	motor.set(RobotMap.topLightPower);
    }
    
    public static void spinBackward() {
    	motor.set(-RobotMap.topLightPower);
    }

    public static void stop() {
    	motor.set(0);
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new TopLightStop());
    }
}
