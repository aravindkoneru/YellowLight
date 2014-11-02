import java.util.Random;

public class RandomSituationGen {
	
	Random gen = new Random();//for random issues
	private int vi = 0;//for random speed down the road (ft/s)
	private int a = 0;//for random acceleration (ft/s^2)
	private int fromLight = 0;//for random distance from yellow light (ft)
	private final double reactionTime = 1;//reaction time (s)
	private double lightTime = 0;
	private boolean speed = false;
	
	public RandomSituationGen(boolean sped){//if speed: use faster (50)
		speed = sped;
		genAcceleration();
		if(sped){
			genVI50();
			distanceFromLight50();
		} else{
			genVI30();
			distanceFromLight30();
		}
		yellowLight();
	}
	
	public void genAcceleration(){// in ft/s^2
		a = -1 * (gen.nextInt(15) + 15);
	}
	
	public void genVI50(){// in ft/s (range: 50 - 55)
		vi =  gen.nextInt(10) + 70;
	}
	
	public void genVI30(){// in ft/s (range: 30 - 35)
		vi = gen.nextInt(10) + 41;
	}
	
	public void distanceFromLight30(){// in feet
		fromLight = gen.nextInt(100)+100;
	}
	
	public void distanceFromLight50(){//in feet
		fromLight = gen.nextInt(100)+200;
	}
	
	public void yellowLight(){
		lightTime = gen.nextInt(10);
	}
	
	public double getVI(){
		return vi;
	}
	
	public double getFromLight(){
		return fromLight;
	}
	
	public double getAcceleration(){
		return a;
	}
	
	public double getLightTime(){
		return lightTime;
	}
	
	public boolean getSpeed(){
		return speed;
	}
	
	public String toString(){
		return "Vi = " + vi + " a = " + a + " fromLight = " + fromLight;
	}
	
	
	
	
	
}
