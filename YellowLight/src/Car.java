//Use this class to get the position of cars.
/*
 * Given the rate of change, this class will determine what the new 
 * x and y cordinates of the car should be. 
 */

public class Car {

	private double a = 0;
	private double vi = 0;
	private int xCord = 0;
	private int yCord = 0;
	private boolean speed = false;
	private int time = -1;
	private String pass = "false";// ghetto boolean ftw

	
	//mostly self explanatory: mph determines if the car is on the 50mph road or the 30mph road
	//canPass determines if the car should just keep going at a constant velocity or stop
	public Car(double vI, double acel, int x, int y, boolean mph, String canPass) {
		a = acel;
		vi = vI;
		xCord = x;
		yCord = y;
		speed = mph;
		pass = canPass;
	}

	public int getX() {
		return xCord;
	}

	public int getY() {
		return yCord;
	}

	public boolean getSpeed() {
		return speed;
	}

	//time incrementer so that it changes the time each second
	public void moreTime() {
		time++;
	}

	public int getTime() {
		return time;
	}

	//use for debugging
	public int getChange() {
		if(pass.equals("true")){
			return 1;
		}
		return (int) (vi + (a * time));
	}

	//too many if statements
	public void calcMovement() {
		if (pass.equals("true")) {//if the car is not slowing down, but just passing 
			//System.out.println("We made it");
			if (speed) {
				xCord += Math.abs(vi);
			} else {
				yCord += Math.abs(vi);
			}
		} else {//if the car is slowing down/stopping
			//System.out.println("NOT");
			if (time == 0) {//this accounts for the 1 second reaction time
				if (speed) {//50 mph road
					xCord += Math.abs(vi) / 1.5;//conversion rate of feet to pixels
				} else {//30 mph road
					yCord += Math.abs(vi);
				}
			} else {
				int change = (int) (vi + (a * time));//calculate the change 
				if (change > 0) {
					if (speed) {//50 mph road
						xCord += Math.abs(change) / 1.5;
					} else {// 30 mph road
						yCord += Math.abs(change);
					}
				}
			}
		}

	}

	public String toString() {
		return ("a = " + a + " vi = " + vi + " xCord = " + xCord + " yCord = "
				+ yCord + " speed = " + speed);
	}

}
