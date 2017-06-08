package org.usfirst.frc.team937.robot;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class PDP extends PowerDistributionPanel {
	
	public double leftMotor1Current;
	public double leftMotor2Current;
	public double rightMotor1Current;
	public double rightMotor2Current;
	
	public void init() {
		this.clearStickyFaults();
	}

	public void updateValues() {
		SmartDashboard.putNumber("PDP volts", this.getVoltage());
		SmartDashboard.putNumber("PDP Current", this.getTotalCurrent());
		
		leftMotor1Current = this.getCurrent(RobotMap.drivetrainLeftMotor1Channel);
		leftMotor2Current = this.getCurrent(RobotMap.drivetrainLeftMotor2Channel);
		rightMotor1Current = this.getCurrent(RobotMap.drivetrainLeftMotor1Channel);
		rightMotor2Current = this.getCurrent(RobotMap.drivetrainLeftMotor2Channel);
	}
}
