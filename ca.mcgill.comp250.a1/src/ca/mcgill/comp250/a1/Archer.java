package ca.mcgill.comp250.a1;

public class Archer extends MilitaryUnit {
private int numberArrows;

public Archer(Tile x, double hp, String faction) {
	super(x,hp, 2,  faction,  15.0, 2, 0);
	this.numberArrows = 5;
	
}

}