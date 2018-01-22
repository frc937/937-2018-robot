package org.usfirst.frc.team937.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team937.robot.Robot;
import org.usfirst.frc.team937.robot.RobotMap;

/**
 * Camera subsystem
 * <p>
 * most code for the camera should be in here somewhere
 */
public abstract class Camera extends Subsystem {
	
	static CameraServer server;
	
    public static void init() {
    	
    	//server = CameraServer.getInstance();
    	//server.setQuality(50);
    	//server.startAutomaticCapture("cam0");
    	
    	
    	//Robot.visionThread.setDaemon(true);
		//Robot.visionThread.start();
    }
    
    /*public static Runnable thread() {
    	
    	//camera setup
    	AxisCamera camera = CameraServer.getInstance().addAxisCamera(RobotMap.cameraIP);
    	camera.setResolution(640, 480);
    	
    	//get camera video
    	CvSink cvSink = CameraServer.getInstance().getVideo();
    	
    	//display video
    	CvSource outputStream = CameraServer.getInstance().putVideo("Rectangle", 640, 480);
    	Mat mat = new Mat();
    	while (!Thread.interrupted()) {
    		if (cvSink.grabFrame(mat) == 0) {
    			outputStream.notifyError(cvSink.getError());
    			continue;
    		}
    		outputStream.putFrame(mat);
    	}
		return null;
    }
    
    public void initDefaultCommand() {
    	
    }*/
}
