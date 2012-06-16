package wrath.models.items;

public class Armor extends Item{
	private int armor;
	
	public Armor(){
		
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public String toString(){
		return "Name: " + this.getName() + "\nArmor: " + this.getArmor() + "\nStrength: " + this.getStrength() + ", Agility: " + this.getAgility() + 
			", Intellect: " + this.getIntellect() + ", Vitality: " + this.getVitality()
			+ "";
	}
}
