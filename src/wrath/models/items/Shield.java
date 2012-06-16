package wrath.models.items;

public class Shield extends Item{
	
	private double blockPercentage;
	private int armor;
	private int strengthRequirement;
	
	public Shield(){
		blockPercentage = 0;
		armor = 0;
		strengthRequirement = 0;
	}
	
	public double getBlockPercentage() {
		return blockPercentage;
	}
	public void setBlockPercentage(double blockPercentage) {
		this.blockPercentage = blockPercentage;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public int getStrengthRequirement() {
		return strengthRequirement;
	}
	public void setStrengthRequirement(int strengthRequirement) {
		this.strengthRequirement = strengthRequirement;
	}
	
	public String toString(){
		return "Name: " + this.getName() + "\nArmor: " + this.getArmor() + ", Strength Requirement: " + this.getStrengthRequirement() +", Block " + this.getBlockPercentage() + "%\nStrength: " + this.getStrength() + ", Agility: " + this.getAgility() + 
				", Intellect: " + this.getIntellect() + ", Vitality: " + this.getVitality()
				+ "";
	}

}
