package org.usfirst.frc.team937.driverStation;

import org.usfirst.frc.team937.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;

public class RawControllerValues {
	
	public boolean a;
	public boolean b;
	public boolean x;
	public boolean y;
	public boolean lb;
	public boolean rb;
	public boolean back;
	public boolean start;
	public boolean ls;
	public boolean rs;
	public boolean lt;
	public boolean rt;
	
	public boolean dpadUp;
	public boolean dpadRight;
	public boolean dpadDown;
	public boolean dpadLeft;
	
	public double dpadX;
	public double dpadY;
	
	public double leftX;
	public double leftY;
	public double rightX;
	public double rightY;
	
	public double ltAxis;
	public double rtAxis;
	
	public RawControllerValues(Joystick controller) {
		//update buttons
		a = controller.getRawButton(RobotMap.controllerANumber);
		b = controller.getRawButton(RobotMap.controllerBNumber);
		x = controller.getRawButton(RobotMap.controllerXNumber);
		y = controller.getRawButton(RobotMap.controllerYNumber);
		lb = controller.getRawButton(RobotMap.controllerLBNumber);
		rb = controller.getRawButton(RobotMap.controllerRBNumber);
		back = controller.getRawButton(RobotMap.controllerBackNumber);
		start = controller.getRawButton(RobotMap.controllerStartNumber);
		ls = controller.getRawButton(RobotMap.controllerLSNumber);
		rs = controller.getRawButton(RobotMap.controllerRSNumber);
		
		//update d-pad
		int dpadAngle = controller.getPOV(RobotMap.controllerPOVNumber);
		
		//this is so I don't have to type these 800 times
		dpadUp = false;
		dpadRight = false;
		dpadDown = false;
		dpadLeft = false;
		
		switch (dpadAngle) {
		case 0:
			dpadUp = true;
			dpadX = 0;
			dpadY = 1;
			break;
		case 45:
			dpadUp = true;
			dpadRight = true;
			dpadX = 0.5;
			dpadY = 0.5;
			break;
		case 90:
			dpadRight = true;
			dpadX = 1;
			dpadY = 0;
			break;
		case 135:
			dpadRight = true;
			dpadDown = true;
			dpadX = 0.5;
			dpadY = -0.5;
			break;
		case 180:
			dpadDown = true;
			dpadX = 0;
			dpadY = -1;
			break;
		case 225:
			dpadDown = true;
			dpadLeft = true;
			dpadX = -0.5;
			dpadY = -0.5;
			break;
		case 270:
			dpadLeft = true;
			dpadX = -1;
			dpadY = 0;
			break;
		case 315:
			dpadLeft = true;
			dpadUp = true;
			dpadX = -0.5;
			dpadY = 0.5;
			break;
		default:
			dpadX = 0;
			dpadY = 0;
			break;
		}
		
		//update joystick values
		leftX = controller.getRawAxis(RobotMap.controllerLeftXAxis);
		leftY = -controller.getRawAxis(RobotMap.controllerLeftYAxis);
		rightX = controller.getRawAxis(RobotMap.controllerRightXAxis);
		rightY = -controller.getRawAxis(RobotMap.controllerRightYAxis);
		
		//update trigger values
		ltAxis = controller.getRawAxis(RobotMap.controllerLeftTrigger);
		rtAxis = controller.getRawAxis(RobotMap.controllerRightTrigger);
		
		lt = ltAxis > RobotMap.triggerPullThreshold;
		rt = rtAxis > RobotMap.triggerPullThreshold;
	}
}
