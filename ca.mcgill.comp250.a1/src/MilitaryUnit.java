//package ca.mcgill.comp250.a1;

public class MilitaryUnit extends Unit {
	private double attackDamage;
	private int attackRange;
	private int armor;
	
	public MilitaryUnit(Tile x, double hp, int range, String faction, double attackDamage, int attackRange, int armor) {
		super(x, hp, range, faction);
		this.attackDamage = attackDamage;
		this.attackRange = attackRange;
		this.armor = armor;
	}
	public void setAttackDamage(double x) {
		this.attackDamage = x;
	}
	public void setAttackRange(int x) {
		this.attackRange = x;
	}
	public void setArmor(int x) {
		this.armor = x;
	}
	public void takeAction(Tile p) {
		if (Tile.getDistance(p, this.getPosition()) <= (this.attackRange +1)) {
			double damage = this.attackDamage;
			
			if(p.isImproved() == true) {
				damage = damage*(1.05);
			} 
			if(p.selectWeakEnemy(this.getFaction()) == null) {
				
			}
			else if (damage > p.selectWeakEnemy(this.getFaction()).getHP()) {
				p.removeUnit(p.selectWeakEnemy(this.getFaction()));
			}
			else {
				p.selectWeakEnemy(this.getFaction()).setHP(p.selectWeakEnemy(this.getFaction()).getHP()-damage);
			}
			}
		
	}
	public void receiveDamage(double x) {
		x = x * (100/(100+this.armor));
		super.receiveDamage(x);
				}
}