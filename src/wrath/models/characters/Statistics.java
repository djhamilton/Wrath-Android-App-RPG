package wrath.models.characters;

import java.util.Random;

public class Statistics {
	
	private int agility;
	private int strength;
	private int vitality;
	private int intellect;
	
	private Equipment equipment;
	
	private int armor;
	private int blockPercentage;
	private int physicalReduction;
	private int magicReduction;
	
	private double attacksPerSecond;
	
	//default values for a level one
	public Statistics(Equipment e){
		this.setAgility(15);
		this.setStrength(20);
		this.setVitality(30);
		this.setIntellect(10);
		this.equipment = e;
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
	
	
	//3% of armor and 10% of magic reduction
	public double getPercentPhysicalDamageReduction(){
		return (this.armor*.03)+(this.physicalReduction*.1)+(this.strength*.01);
	}
	
	//-1% of armor and 10% of magic reduction
	public double getPercentMagicDamageReduction(){
		return (this.armor*.01)+(this.magicReduction*.1) + (this.intellect*.01);
	}
	
	public int getTotalStrength(){
		int returnStr = this.strength;
		if(this.equipment.getArmor() != null){
			returnStr += this.equipment.getArmor().getStrength();
		}
		if(this.equipment.getSetOne().isActive()){
			if(this.equipment.getSetOne().getWeapon() != null){
				returnStr += this.equipment.getSetOne().getWeapon().getStrength();
			}
			if(this.equipment.getSetOne().getShield() != null){
				returnStr += this.equipment.getSetOne().getShield().getStrength();
			}
		}
		else{
			if(this.equipment.getSetTwo().getWeapon() != null){
				returnStr += this.equipment.getSetOne().getWeapon().getStrength();
			}
			if(this.equipment.getSetTwo().getShield() != null){
				returnStr += this.equipment.getSetTwo().getShield().getStrength();
			}
		}
		return returnStr;
	}
	
	public int getTotalAgility(){
		int returnAgi = this.agility;
		if(this.equipment.getArmor() != null){
			returnAgi += this.equipment.getArmor().getAgility();
		}
		if(this.equipment.getSetOne().isActive()){
			if(this.equipment.getSetOne().getWeapon() != null){
				returnAgi += this.equipment.getSetOne().getWeapon().getAgility();
			}
			if(this.equipment.getSetOne().getShield() != null){
				returnAgi += this.equipment.getSetOne().getShield().getAgility();
			}
		}
		else{
			if(this.equipment.getSetTwo().getWeapon() != null){
				returnAgi += this.equipment.getSetOne().getWeapon().getAgility();
			}
			if(this.equipment.getSetTwo().getShield() != null){
				returnAgi += this.equipment.getSetTwo().getShield().getAgility();
			}
		}
		return returnAgi;
	}
	
	public int getTotalVitality(){
		int returnVit = this.vitality;
		if(this.equipment.getArmor() != null){
			returnVit += this.equipment.getArmor().getVitality();
		}
		if(this.equipment.getSetOne().isActive()){
			if(this.equipment.getSetOne().getWeapon() != null){
				returnVit += this.equipment.getSetOne().getWeapon().getVitality();
			}
			if(this.equipment.getSetOne().getShield() != null){
				returnVit += this.equipment.getSetOne().getShield().getVitality();
			}
		}
		else{
			if(this.equipment.getSetTwo().getWeapon() != null){
				returnVit += this.equipment.getSetOne().getWeapon().getVitality();
			}
			if(this.equipment.getSetTwo().getShield() != null){
				returnVit += this.equipment.getSetTwo().getShield().getVitality();
			}
		}
		return returnVit;
	}
	
	public int getTotalIntellect(){
		int returnInt = this.vitality;
		if(this.equipment.getArmor() != null){
			returnInt += this.equipment.getArmor().getIntellect();
		}
		if(this.equipment.getSetOne().isActive()){
			if(this.equipment.getSetOne().getWeapon() != null){
				returnInt += this.equipment.getSetOne().getWeapon().getIntellect();
			}
			if(this.equipment.getSetOne().getShield() != null){
				returnInt += this.equipment.getSetOne().getShield().getIntellect();
			}
		}
		else{
			if(this.equipment.getSetTwo().getWeapon() != null){
				returnInt += this.equipment.getSetOne().getWeapon().getIntellect();
			}
			if(this.equipment.getSetTwo().getShield() != null){
				returnInt += this.equipment.getSetTwo().getShield().getIntellect();
			}
		}
		return returnInt;
	}
	
	// .02 of str as damage increase
	public int getPhsyicalDamage(){
		Random r = new Random();
		int damage = 0;
		if(this.equipment.getSetOne().isActive()){
			if(!this.equipment.getSetOne().getWeapon().doesMagicDamage()){
				int range = this.equipment.getSetOne().getWeapon().getMaximumDmg() 
						- this.equipment.getSetOne().getWeapon().getMinimumDmg();
				damage += this.equipment.getSetOne().getWeapon().getMinimumDmg() + r.nextInt(range);
				damage *= (this.getTotalStrength()*.02);
			}
		}
		else{
			if(!this.equipment.getSetTwo().getWeapon().doesMagicDamage()){
				int range = this.equipment.getSetTwo().getWeapon().getMaximumDmg() 
						- this.equipment.getSetTwo().getWeapon().getMinimumDmg();
				damage += this.equipment.getSetTwo().getWeapon().getMinimumDmg() + r.nextInt(range);
				damage *= (this.getTotalStrength()*.02);
			}
		}
		return damage;
	}
	
	public int getMagicDamage(){
		Random r = new Random();
		int damage = 0;
		if(this.equipment.getSetOne().isActive()){
			if(this.equipment.getSetOne().getWeapon().doesMagicDamage()){
				int range = this.equipment.getSetOne().getWeapon().getMaximumDmg() 
						- this.equipment.getSetOne().getWeapon().getMinimumDmg();
				damage += this.equipment.getSetOne().getWeapon().getMinimumDmg() + r.nextInt(range);
				damage *= (this.getTotalIntellect()*.02);
			}
		}
		else{
			if(this.equipment.getSetTwo().getWeapon().doesMagicDamage()){
				int range = this.equipment.getSetTwo().getWeapon().getMaximumDmg() 
						- this.equipment.getSetTwo().getWeapon().getMinimumDmg();
				damage += this.equipment.getSetTwo().getWeapon().getMinimumDmg() + r.nextInt(range);
				damage *= (this.getTotalIntellect()*.02);
			}
		}
		return damage;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

}
