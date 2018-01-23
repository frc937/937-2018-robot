package org.usfirst.frc.team937.utilty;

/**
 * PID class
 * <p>
 * for when you need to get a thing to a place using a sensor
 */
public class PID {

    private double target = 0.0;
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

    /**
    * sets target position
    */
    public void setTarget(double target) {
        this.target = target;
    }

    /**
    * @return position component
    */
    public double getP(double actual) {
        return Pmultiplier * (target - actual);
    }

    /**
    * @return integral component
    */
    public double getI(double actual) {
        integral += target - actual;
        return Imultiplier * integral;
    }

    /**
    * @return derivative component
    */
    public double getD(double actual) {
        double newError = target - actual;
        double diff = newError - lastError;
        lastError = newError;
        return Dmultiplier * newError;
    }

    /**
    * @return PI controller
    */
    public double getPI(double actual) {
        return getP(actual) + getI(actual);
    }

    /**
    * @return PD controller
    */
    public double getPD(double actual) {
        return getP(actual) + getD(actual);
    }

    /**
    * @return ID controller
    */
    public double geID(double actual) {
        return getI(actual) + getD(actual);
    }

    /**
    * @return PID controller
    */
    public double getPID(double actual) {
        return getP(actual) + getI(actual) + getD(actual);
    }

}