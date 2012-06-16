package wrath.models.characters;

public class Statistics {
	
	private int agility;
	private int strength;
	private int vitality;
	private int intellect;
	
	private int minDamage;
	private int maxDamage;
	
	private int armor;
	private int blockPercentage;
	private int physicalReduction;
	private int magicReduction;
	
	private double attacksPerSecond;
	
	//default values for a level one
	public Statistics(){
		this.setAgility(15);
		this.setStrength(20);
		this.setVitality(30);
		this.setIntellect(10);
	}
	
	//base statistics to be set from the player
	public Statistics(int a, int s, int v, int i){
		this.setAgility(a);
		this.setStrength(s);
		this.setVitality(v);
		this.setIntellect(i);
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	public int getIntellect() {
		return intellect;
	}

	public void setIntellect(int intellect) {
		this.intellect = intellect;
	}

	public int getMaxDamage() {
		return maxDamage;
	}

	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}

	public int getMinDamage() {
		return minDamage;
	}

	public void setMinDamage(int minDamage) {
		this.minDamage = minDamage;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getBlockPercentage() {
		return blockPercentage;
	}

	public void setBlockPercentage(int blockPercentage) {
		this.blockPercentage = blockPercentage;
	}

	public int getPhysicalReduction() {
		return physicalReduction;
	}

	public void setPhysicalReduction(int physicalReduction) {
		this.physicalReduction = physicalReduction;
	}

	public int getMagicReduction() {
		return magicReduction;
	}

	public void setMagicReduction(int magicReduction) {
		this.magicReduction = magicReduction;
	}

	public double getAttacksPerSecond() {
		return attacksPerSecond;
	}

	public void setAttacksPerSecond(double attacksPerSecond) {
		this.attacksPerSecond = attacksPerSecond;
	}

}
