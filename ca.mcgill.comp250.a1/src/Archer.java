//package ca.mcgill.comp250.a1;

public class Archer extends MilitaryUnit {
private int numberArrows;

public Archer(Tile x, double hp, String faction) {
	super(x,hp, 2,  faction,  15.0, 2, 0);
	this.numberArrows = 5;
	
}
public void takeAction(Tile p) {
	if (this.numberArrows == 0) {
		this.numberArrows = 5;
	}
	else {
		super.takeAction(p);
		this.numberArrows--;
	}
}
public boolean equals(Object p) {
	boolean equal = false;
	if (super.equals(p)==true) {
		Archer k;
		k = (Archer) p;
		if (k.numberArrows == this.numberArrows) {
			equal = true;
		}
	}
	return equal;
}

}