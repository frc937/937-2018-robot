package org.usfirst.frc.team937.robot;

import edu.wpi.first.wpilibj.*;

/**
 * PID class
 * <p>
 * for when you need to get a thing to a place using a sensor
 */
public class PID {

    private double integeral = 0.0;
    private double lastError = 0.0;

    private double Pmultiplier;
    private double Imultiplier;
    private double Dmultiplier;

    /**
    * default constructor
    */
    public PID() {
        Pmultiplier = 1.0;
        Imultiplier = 1.0;
        Dmultiplier = 1.0;
    }

    /**
    * constructor with multipliers
    * @param p
    *   p multiplier
    * @param i
    *   i multiplier
    * @param d
    *   d multiplier
    */
    public PID(double p, double i, double d) {
        Pmultiplier = p;
        Imultiplier = i;
        Dmultiplier = d;
    }





    
}