
public class SituationTester {
	
	public static void main(String[] args){
		RandomSituationGen situation = new RandomSituationGen(true);
		SimPhysics physics = new SimPhysics(situation.getVI(), situation.getAcceleration(), situation.getFromLight(), situation.getLightTime());
		
		
		
		
	}

}
