package org.usfirst.frc.team937.robot;

public class UpdateControllerValues {

    public static boolean a;
    public static boolean b;
    public static boolean x;
    public static boolean y;

    public void UpdateControllerValues(Joystick controller) {
       a = controller.getRawButton(RobotMap.controllerXNumber);
    }
}
