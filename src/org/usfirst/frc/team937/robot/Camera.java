package org.usfirst.frc.team937.robot;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.*;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/**
 * Camera subsystem
 * <p>
 * most code for the camera should be in here somewhere
 */
public class Camera {
	
	public Camera(String name) {
		
		new Thread(() -> {
            UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
            camera.setFPS(30);
            camera.setResolution(640, 480);
            CvSink cvSink = CameraServer.getInstance().getVideo();
            CvSource outputStream = CameraServer.getInstance().putVideo(name, 640, 480);
            
            Mat source = new Mat();
            Mat output = new Mat();
            
            while(!Thread.interrupted()) {
                cvSink.grabFrame(source);
                Imgproc.cvtColor(source, output, Imgproc.COLOR_BGR2GRAY);
                outputStream.putFrame(output);
            }
        }).start();
	}
    
}