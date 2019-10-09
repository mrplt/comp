//package ca.mcgill.comp250.a1;

public class Tile {
	private int x;
	private int y;
	private boolean cityBuilt;
	private boolean improvement;	
	private ListOfUnits list;
	public Tile(int a, int b) {
		this.x = a; 
		this.y = b;
		cityBuilt = false;
		improvement = false;
		list = new ListOfUnits();
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
				if (this.list.get(i) == null) {
					this.list.add(a);
					isAdded = true;
				}
			}
		}
		return isAdded;
	}
	public boolean removeUnit(Unit a) {
		return this.list.remove(a);
	}
	public Unit selectWeakEnemy(String a) {
		if (this.list.size() == 0) {
			return null;
		}
		else {
		Unit[] tmp = new Unit[this.list.size()];
		int c = 0;
		for (int i=0; i<this.list.size(); i++) {
			if (this.list.get(i).getFaction() != a) {
				tmp[c] = this.list.get(i);
				c++;
			}
		}
		Unit smallest = tmp[0];
		for (int i=0;i<c;i++) {
			if (smallest.getHP() > tmp[i].getHP()) {
				smallest = tmp[i];
			}
		}
		return smallest;
		}
	}
	
	public static double getDistance(Tile a, Tile b) {
		double distance = Math.sqrt((a.getX()-b.getX())^2 + (a.getY() - b.getY())^2);
		return distance;
	}
	
}
