package org.usfirst.frc.team937.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team937.robot.Robot;
import org.usfirst.frc.team937.robot.RobotMap;

/**
 * Top light subsystem
 * <p>
 * most code for the top light should be in here somewhere
 */
public class TopLight extends Subsystem {

	/** the motor for the top light */
	private static Talon motor = new Talon(RobotMap.topLightPort);
	
    public static void SpinForward() {
    	motor.set(RobotMap.topLightPower);
    }
    
    public static void SpinBackward() {
    	motor.set(-RobotMap.topLightPower);
    }

    public static void Stop() {
    	motor.set(0);
    }
    
    /** Update driver station values */
    public static void DSUpdate() {
        SmartDashboard.putNumber("Light Power",RobotMap.topLightPower);
    }

    public void initDefaultCommand() {
    	
    }

	public static void update() {
		final double power = Robot.driverController.rtAxis - Robot.driverController.ltAxis - RobotMap.topLightCorrection;
		TopLight.motor.set(power);
	}
}
