//package ca.mcgill.comp250.a1;

public class ListOfUnits {
	private Unit[] Units;
	private int size = 0;
	private int arraySize = 10;
	public ListOfUnits() {
		Units = new Unit[arraySize];
	}
	public int size() {
		int a = 0;
		//return this.size;
		for (int i=0;i<arraySize;i++) {
			if (Units[i] != null) {
				a++;
			}
		}
		return a;
	}
	public Unit get(int a) {
		return Units[a];
	}
	public Unit[] getUnits() {
		if (this.size() == 0) {
			return null;
		}
		else {
		int a = 0;
		Unit[] tmp = new Unit[this.size()];
		for(int i=0;i<arraySize;i++) {
			if (Units[i] != null)
			{
				tmp[a] = Units[i];
				a++;
			}
		}
		return tmp;
		}
		}
	public void add(Unit k) {
		if (size >= arraySize) {
			this.arraySize = arraySize*(3/2)+1;
			Unit[] tmp = new Unit[arraySize];
			for (int i=0;i<arraySize;i++) {
				Units[i] = tmp[i];
			}
			tmp = Units;
		}
		Units[size+1] = k;
		size++;
	}
	public int indexOf(Unit a) {
		boolean noReturn = false;
		int result = 0;
		while(noReturn) {
		for (int i=0;i<size;i++) {
			if (a.equals(Units[i]) == true) {
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
			for (int i=0;i<size;i++) {
				while(isFound = false) {
			if (a.equals(Units[i]) == true)
			{
				for (int k=i;k<size;k++) {
					Units[k] = Units[k+1];
				}
				Units[size] = null;
				isFound = true;
			}
		}
			}
			return isFound;
	}
	public MilitaryUnit[] getArmy() {
		int a = 0;
		for (int i=0;i<arraySize;i++) {
			if(Units[i] instanceof MilitaryUnit) {
				a++;
			}
		}
		MilitaryUnit[] tmp = new MilitaryUnit[a];
		a = 0;
		for (int i=0;i<arraySize;i++) {
			if(Units[i] instanceof MilitaryUnit) {
				Units[i] = tmp[a];
				a++;
			}
		}
		return tmp;
	}
	}
