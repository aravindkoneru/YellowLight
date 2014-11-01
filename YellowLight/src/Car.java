//Use this class to get the position of cars.
/*
 * Given the rate of change, this class will determine what the new 
 * x and y cordinates of the car should be. 
 */

public class Car {
	
	private double change = 0;
	private int xCord = 0;
	private int yCord = 0; 
	private boolean speed = false;
	
	public Car(double c, int x, int y, boolean mph){
		change = c;
		xCord = x;
		yCord = y;
		speed = mph;
	}
	
	public int getX(){
		return xCord;
	}
	
	public int getY(){
		return yCord;
	}
	
	public boolean getSpeed(){
		return speed;
	}
	
	public void calcMovement(){
		if(speed){
			xCord += Math.abs(change);
		} else{
			yCord += Math.abs(change);
		}
		
	}

}
