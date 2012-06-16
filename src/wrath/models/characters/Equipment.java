package wrath.models.characters;

import wrath.models.items.Armor;

public class Equipment {

	private Armor armor;
	private WeaponSet setOne;
	private WeaponSet setTwo;
	private WeaponSet setThree;
	
	public Equipment(){
	}
	
	//unequip current armor
	public void equip(Armor a){
		this.setArmor(a);
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public WeaponSet getSetOne() {
		return setOne;
	}

	public void setSetOne(WeaponSet setOne) {
		this.setOne = setOne;
	}

	public WeaponSet getSetTwo() {
		return setTwo;
	}

	public void setSetTwo(WeaponSet setTwo) {
		this.setTwo = setTwo;
	}

	public WeaponSet getSetThree() {
		return setThree;
	}

	public void setSetThree(WeaponSet setThree) {
		this.setThree = setThree;
	}

}
