package ca.mcgill.comp250.a1;

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
}