package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		//car.setSpeed(10);
		//car.getSpeed();
		//System.out.println(car.getSpeed());
		
		//car.setDoors("Closed");
		//System.out.println(car.getDoors());
		
		/*car.setDoors("open");
		car.setDriver("seated");
		car.setEngine("on");
		car.setSpeed(2);*/
		System.out.println(car.run());
		
		Car toyota = new Car("closed", "on", "seated", 4);
		
		System.out.println(toyota.run());
	}

}
