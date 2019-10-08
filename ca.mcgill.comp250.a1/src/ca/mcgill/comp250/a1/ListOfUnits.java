package ca.mcgill.comp250.a1;

public class ListOfUnits {
	private Unit[] Units;
	//private int listSize;
	private Unit[] listOfUnits;
	private int listCap;
	public void createList() {
		listCap = 9;
		Unit[] listOfUnits = new Unit[listCap];
	}
	public int size() {
		int a = 0;
		for (int i = 0; i<listCap+1; i++) {
			if (listOfUnits[i] != null) {
				a++;
			}
		}
		return a;
	}
	public Unit get(int a) {
		return listOfUnits[a];
	}
	public Unit[] getUnits() {
		Unit[] tmp = new Unit[this.size()];	
		//TODO Implement a get unit method
		int a = 0;
		for (int i = 0; i<listCap+1; i++) {
			if (listOfUnits[i] != null) {
				tmp[a] = listOfUnits[i];
				a++;
			}
			}
		return tmp;
		}
	public void add(Unit k) {
		if (this.size()<listCap+1) {
			listOfUnits[this.size()+1] = k;
		}
		else {
			int newSize = (int)((this.size())*(1.5)) + 1;
			Unit[] tmp = new Unit[newSize];
			for (int i=0; i<listCap+1; i++) {
				listOfUnits[i] = tmp[i];
			}
			listOfUnits = tmp;
			listOfUnits[listCap+1] = k;
			listCap = newSize;
		}
	}
	public int indexOf(Unit a) {
		boolean noReturn = false;
		int result = 0;
		while(noReturn) {
		for (int i=0;i<listCap+1;i++) {
			if (a.equals(listOfUnits[i]) == true) {
				noReturn = true;
				result = i;
			}
			else {
				result = -1;
			}
		}
		}
		return result;
	}
	public boolean remove(Unit a) {
		boolean isFound = false;
			for (int i=0;i<listCap+1;i++) {
				while(isFound = false) {
			if (a.equals(listOfUnits[i]) == true)
			{
				Unit tmp = listOfUnits[i];
				for (int k=i;k<listCap;k++) {
					listOfUnits[k] = listOfUnits[k+1];
				}
				listOfUnits[listCap] = null;
				isFound = true;
			}
		}
			}
			return isFound;
	}
	public MilitaryUnit[] getArmy() {
		int a = 0;
		for (int i=0;i<listCap+1;i++) {
			if(listOfUnits[i] instanceof MilitaryUnit) {
				a++;
			}
		}
		MilitaryUnit[] tmp = new MilitaryUnit[a];
		a = 0;
		for (int i=0;i<listCap+1;i++) {
			if(listOfUnits[i] instanceof MilitaryUnit) {
				listOfUnits[i] = tmp[a];
				a++;
			}
		}
		return tmp;
	}
	}
