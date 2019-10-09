//package ca.mcgill.comp250.a1;

public class Worker extends Unit {
	private int numberOfJobs;

		public Worker(Tile x, double hp, String faction) {
			super(x, hp, 2, faction);
			numberOfJobs = 0;
		}
		public void takeAction(Tile p) {
			if ((this.getPosition() == p) && (p.isImproved() == false)) {
				p.buildImprovement();
				numberOfJobs++;
				if (numberOfJobs == 10) {
				p.removeUnit(this);
			}
			}
		}
		public boolean equals(Object p) {
			boolean equal = false;
			if (super.equals(p)==true) {
				Worker k;
				k = (Worker) p;
				if (k.numberOfJobs == this.numberOfJobs) {
					equal = true;
				}
			}
			return equal;
		}
}