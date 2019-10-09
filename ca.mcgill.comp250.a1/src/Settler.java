//package ca.mcgill.comp250.a1;

public class Settler extends Unit {
	public Settler(Tile x, double hp, String faction) {
		super(x, 2, 2, faction);

	}
	public void takeAction(Tile p) {
		if ((this.getPosition() == p) && (p.isCity() == false)) {
			p.foundCity();
			p.removeUnit(this);
		}
	}
	public boolean equals(Object p) {
		if (p instanceof Unit) {
			return super.equals(p);
		}
		else {
			return false;
		}
	}
	
}