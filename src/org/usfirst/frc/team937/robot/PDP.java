package org.usfirst.frc.team937.robot;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Power distribution Panel class
 */
public class PDP extends PowerDistributionPanel {
	
	public double leftMotor1Current;
	public double leftMotor2Current;
	public double rightMotor1Current;
	public double rightMotor2Current;
	public double topLightCurrent;
	
	public void init() {
		//this.clearStickyFaults();
	}

	/**
	 * keeps PDP values current
	 * <p>
	 * just like the name says
	 */
	public void updateValues() {
		leftMotor1Current = this.getCurrent(RobotMap.drivetrainLeftMotor1PDPChannel);
		leftMotor2Current = this.getCurrent(RobotMap.drivetrainLeftMotor2PDPChannel);
		rightMotor1Current = this.getCurrent(RobotMap.drivetrainLeftMotor1PDPChannel);
		rightMotor2Current = this.getCurrent(RobotMap.drivetrainLeftMotor2PDPChannel);
		topLightCurrent = this.getCurrent(RobotMap.topLightPDPChannel);
		
	}
}
