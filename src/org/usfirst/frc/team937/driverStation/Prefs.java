package org.usfirst.frc.team937.driverStation;

import edu.wpi.first.wpilibj.Preferences;

public class Prefs {
	
	//declare preferences
	public static int driverControllerPort;
	public static int copilotControllerPort;
	
	private Preferences preferences;

	public Prefs() {
		preferences = Preferences.getInstance();
		//get preferences
		driverControllerPort = preferences.getInt("Driver Controller Port", 0);
		copilotControllerPort = preferences.getInt("Copilot Controller Port", 1);
	}
}
