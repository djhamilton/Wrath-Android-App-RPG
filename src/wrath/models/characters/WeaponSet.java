package wrath.models.characters;

import wrath.models.items.Shield;
import wrath.models.items.Weapon;

public class WeaponSet {
	
	private Weapon weapon;
	private Shield shield;
	private boolean isActive;
	
	public WeaponSet(){
		setActive(false);
	}
	
	public WeaponSet(Weapon w){
		this.weapon = w;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Shield getShield() {
		return shield;
	}

	public void setShield(Shield shield) {
		this.shield = shield;
	}
	
	public void equipShield(Shield s){
		if(this.weapon.isTwoHanded()){
			//potentially add a weapon.isEquipped = false
			this.weapon = null;
		}
		this.shield = s;
	}
	
	public void equipWeapon(Weapon w){
		if(this.weapon.isTwoHanded()){
			//same as equipShield blah
			this.shield = null;
		}
		this.weapon = w;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
