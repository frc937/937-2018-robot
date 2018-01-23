package org.usfirst.frc.team937.utility;

/**
 * Exponential curve
 * <p>
 * for smooting out an input
 */
public static class ExpoCurve {
    
    public static double curve(double in) {
      return Math.pow(in, 3);
    }
}