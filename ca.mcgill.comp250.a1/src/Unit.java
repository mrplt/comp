//package ca.mcgill.comp250.a1;

 abstract class Unit {
	private Tile position;
	private double healthPoints;
	private int movingRange;
	private String faction;
	
	public Unit(Tile x, double hp, int range, String faction){
		this.position = x;
		this.healthPoints = hp;
		this.movingRange = range;
		this.faction = faction;	
		x.addUnit(this);

	}
	public final Tile getPosition() {
		return this.position;
	}
	public final double getHP() {
		return this.healthPoints;
	}
	public final String getFaction() {
		return this.faction;
	}
	public void setRange(int x) {
		this.movingRange = x;
	}
	public void setPosition(Tile x) {
		this.position = x;
	}
	public void setHP(double hp) {
		this.healthPoints = hp;
	}
	public void setFaction(String faction) {
		this.faction = faction;
	}
	public boolean moveTo(Tile x) {
		Tile currPos = this.getPosition();
		boolean move = false;
		double distance = Tile.getDistance(currPos, x);
				if (distance <= this.movingRange) {
			if(x.selectWeakEnemy(this.getFaction()) == null) {
				this.getPosition().removeUnit(this);
				this.setPosition(x);
				x.addUnit(this);
				move = true;
			}
			
		}
		return move;
	}
	public void receiveDamage(double d) {
		if (this.getHP() < d) {
			this.getPosition().removeUnit(this);
		}
		else {
			double newHP = this.getHP() - d;
			this.setHP(newHP);
		}
	}
	public abstract void takeAction(Tile a);
	
	public boolean equals(Object p) {
		boolean equal = false;
		 if (p.getClass() == this.getClass()) {
			Unit k;
			k = (Unit) p;
			if ((k.getPosition() == this.getPosition()) && (k.getHP() == this.getHP())) {
				equal = true;
			}
		}
	
		return equal;

		}

}