package wrath.models.items;

public class Item {
	
	private String name;
	
	private boolean isMagical;
	
	private int strength;
	private int agility;
	private int intellect;
	private int vitality;
	private int magicDamage;
	private int physicalDamage;
	
	public Item(){
		this.name = "Item";
		this.isMagical = false;
		this.strength = 0;
		this.agility = 0;
		this.intellect = 0;
		this.vitality = 0;
		this.magicDamage = 0;
		this.physicalDamage = 0;
	}

	public int getIntellect() {
		return intellect;
	}

	public void setIntellect(int intellect) {
		this.intellect = intellect;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
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
	
	public String toString(){
		return "Name: " + this.name + "\nStrength: " + this.strength + ", Agility: " + this.agility + 
				", Intellect: " + this.intellect + ", Vitality: " + this.vitality;
	}

	public int getMagicDamage() {
		return magicDamage;
	}

	public void setMagicDamage(int magicDamage) {
		this.magicDamage = magicDamage;
	}

	public int getPhysicalDamage() {
		return physicalDamage;
	}

	public void setPhysicalDamage(int physicalDamage) {
		this.physicalDamage = physicalDamage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMagical() {
		return isMagical;
	}

	public void setMagical(boolean isMagical) {
		this.isMagical = isMagical;
	}
	
}
