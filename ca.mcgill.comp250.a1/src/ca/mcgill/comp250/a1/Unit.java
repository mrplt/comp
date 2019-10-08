package ca.mcgill.comp250.a1;

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
	}
	public Tile getPosition() {
		return this.position;
	}
	public double getHP() {
		return this.healthPoints;
	}
	public String getFaction() {
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
}