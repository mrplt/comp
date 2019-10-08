package ca.mcgill.comp250.a1;

public class Tile {
	private int x;
	private int y;
	private boolean cityBuilt;
	private boolean improvement;
	Unit[] listOfUnits = new Unit[10];
	
	public void createTile(int a, int b) {
		a = this.x; 
		b = this.y;
		cityBuilt = false;
		improvement = false;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public boolean isCity() {
		return this.cityBuilt;
	}
	public boolean isImproved() {
		return this.improvement;
	}
	public void foundCity() {
		this.cityBuilt = true;
	}
	public void buildImprovement() {
		this.improvement = true;
	}
	public boolean addUnit(Unit a) {
		//TODO figure out a way to only add allies
		boolean isAdded = false;
		while (isAdded) {
			for (int i=0;i<10;i++) {
				if (listOfUnits[i] == null) {
					listOfUnits[i] = a;
					isAdded = true;
				}
			}
		}
		return isAdded;
	}
	public boolean removeUnit(Unit a) {
		boolean isFound = false;
			for (int i=0;i<10;i++) {
				while(isFound = false) {
			if (a.equals(listOfUnits[i]) == true)
			{
				Unit tmp = listOfUnits[i];
				for (int k=i;k<10;k++) {
					listOfUnits[k] = listOfUnits[k+1];
				}
				listOfUnits[10] = null;
				isFound = true;
			}
		}
			}
			return isFound;
	}
	public Unit selectWeakEnemy(String a) {
		Unit[] tmp = new Unit[10];
		int c = 0;
		for (int i=1; i<10; i++) {
			if (listOfUnits[i].getFaction() != a) {
				tmp[c] = listOfUnits[i];
				c++;
			}
		}
		Unit smallest = tmp[0];
		for (int i=1;i<10;i++) {
			if (smallest.getHP() > tmp[i].getHP()) {
				smallest = tmp[i];
			}
		}
		return smallest;
	}
	
	public double getDistance(Tile a, Tile b) {
		double distance = Math.sqrt((a.getX()-b.getX())^2 + (a.getY() - b.getY())^2);
		return distance;
	}
	
}
