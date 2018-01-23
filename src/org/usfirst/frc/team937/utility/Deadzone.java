package org.usfirst.frc.team937.robot;

/**
 * Deadzone
 * <p>
 * ignore input if it is too low
 */
public class Deadzone {
    
    private double threshold;

    
    /**
    * Default constructor
    */
    public Deadzone() {
      this.threshold = 0;
    }

    /**
    * Default constructor
    */
    public Deazone(double threshold) {
      this.threshold = threshold;
    }

    /**
    * @return deadzone applied to number
    */
    public static double applyDeadzone(double in) {
      if(in > threshold) return in;
      else return 0;
    }
}