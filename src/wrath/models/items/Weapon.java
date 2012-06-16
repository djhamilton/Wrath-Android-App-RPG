package wrath.models.items;

public class Weapon extends Item{
	
	private int minimumDmg;
	private int maximumDmg;
	
	private boolean isTwoHanded;
	private boolean doesMagicDamage;
	private boolean doesRangedDamage;
	private double attacksPerSecond;
	
	public Weapon(){
		this.maximumDmg = 0;
		this.minimumDmg = 0;
		this.isTwoHanded = false;
		this.doesMagicDamage = false;
		this.doesRangedDamage = false;
		this.attacksPerSecond = 0;
	}
	
	public double getDPS(){
		return (((this.maximumDmg+this.minimumDmg)/2)/this.attacksPerSecond);
	}

	public int getMinimumDmg() {
		return minimumDmg;
	}

	public void setMinimumDmg(int minimumDmg) {
		this.minimumDmg = minimumDmg;
	}

	public int getMaximumDmg() {
		return maximumDmg;
	}

	public void setMaximumDmg(int maximumDmg) {
		this.maximumDmg = maximumDmg;
	}

	public double getAttacksPerSecond() {
		return attacksPerSecond;
	}

	public void setAttacksPerSecond(double attackSpeed) {
		this.attacksPerSecond = attackSpeed;
	}
	
	public String toString(){
		return "Name: " + this.getName() + "\nDPS: " + this.getDPS() + "\nStrength: " + this.getStrength() + ", Agility: " + this.getAgility() + 
				", Intellect: " + this.getIntellect() + ", Vitality: " + this.getVitality()
				+ "";
	}

	public boolean isTwoHanded() {
		return isTwoHanded;
	}

	public void setTwoHanded(boolean isTwoHanded) {
		this.isTwoHanded = isTwoHanded;
	}

	public boolean isDoesMagicDamage() {
		return doesMagicDamage;
	}

	public void setDoesMagicDamage(boolean doesMagicDamage) {
		this.doesMagicDamage = doesMagicDamage;
	}

	public boolean isDoesRangedDamage() {
		return doesRangedDamage;
	}

	public void setDoesRangedDamage(boolean doesRangedDamage) {
		this.doesRangedDamage = doesRangedDamage;
	}

}
