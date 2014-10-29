
public class SituationTester {
	
	public static void main(String[] args){
		//RandomSituationGen situation = new RandomSituationGen(true);
		//SimPhysics physics = new SimPhysics(situation.getVI(), situation.getAcceleration(), situation.getFromLight(), situation.getLightTime());
		//Simphysics(vi, a, fromLight, lightTime)
		//SimPhysics physics = new SimPhysics(70, -15, 300, 5);
		//System.out.println(physics.toString());
		
	
		System.out.format("%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s", "Velocity", "Acceleration", "Stopping Distance", "Distance From Light", "Stopping Time", "Distance Before Braking", "Light Time", "Stop in Time", "Stop in Distance");
		//System.out.println("\n");
		System.out.println();
		for(int x = 0; x < 10; x++){
			RandomSituationGen situation = new RandomSituationGen(true);
			SimPhysics physics = new SimPhysics(situation.getVI(), situation.getAcceleration(), situation.getFromLight(), 5);
			
			System.out.println(physics.toStringFormat());
		}
		
		
		
		
		
	}

}