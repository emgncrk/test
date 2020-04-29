package org.studyeasy;

public class Car {
	

	
	private String doors;
	private String engine;
	private String driver;
	private int speed; //global variable
	
	public Car() {
		doors = "opened";
		engine = "on";
		driver = "absent";
		speed = 4;
	}
		
	
	public Car(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}


	public void setSpeed (int speed) { //local variable
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on") 
				&& driver.equals("seated") && speed > 0) {
			return "running";
		} else { 
			return "not running";}
	}
}
