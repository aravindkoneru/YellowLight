import java.util.Random;

import javax.swing.JFrame;


public class YellowFrame extends JFrame {
	
	//YellowPanel panel = new YellowPanel();
	
	public YellowFrame(){
		Car[] genCars = genCars();
		YellowPanel panel = new YellowPanel(genCars);
		//panel.showCars();
		getContentPane().add(panel);
		pack();
	}
	
	//This code generates the array of cars.
	//Uses the random situation gen and and the physics sim 
	public Car[] genCars(){
		Car[] cars = new Car[20];
		Random gen = new Random();
		for(int x = 0; x < 20; x++){//1.5 feet = 1 pixel 
			if(gen.nextInt(2) == 1){ // make the car a 30 mph car
				RandomSituationGen sit = new RandomSituationGen(false);
				int startingX = 250;
				int startingY = (int)(250 - (sit.getFromLight()));
				SimPhysics sim = new SimPhysics(sit.getVI(), sit.getAcceleration(), sit.getFromLight(), sit.getLightTime());
				Car temp = new Car(sit.getVI(), sit.getAcceleration(), startingX, startingY, sit.getSpeed(), sim.runYellow());
				cars[x] = temp;
				
			} else{// make the car a 50 mph car
				RandomSituationGen sit = new RandomSituationGen(true);
				int startingX = (int)(250 - (sit.getFromLight()/1.5));
				int startingY = 250; 
				SimPhysics sim = new SimPhysics(sit.getVI(), sit.getAcceleration(), sit.getFromLight(), sit.getLightTime());
				Car temp = new Car(sit.getVI(), sit.getAcceleration(), startingX, startingY, sit.getSpeed(), sim.runYellow());
				cars[x] = temp;
			}
		}
		return cars;
	}
	
	public void carTester(){
		for(Car x: genCars()){
			System.out.println(x);
		}
	}
	
	
}
