package ca.mcgill.comp250.a1;

public class Worker extends Unit {
	private int numberOfJobs;

		public Worker(Tile x, double hp, String faction) {
			super(x, hp, 2, faction);
			numberOfJobs = 0;
		}
	
}