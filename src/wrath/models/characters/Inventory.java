package wrath.models.characters;

import java.util.ArrayList;

import wrath.models.items.Item;

public class Inventory {
	
	private int size;
	private int gold;
	private ArrayList<Item> items;
	
	public Inventory(){
		setSize(0);
		setGold(0);
		setItems(new ArrayList<Item>());
	}
	
	public void addItem(Item i){
		this.items.add(i);
	}
	
	public void deleteItem(Item item){
		int i=0;
		while((items.get(i).getName().equals(item.getName())) && (i < items.size())){
			i++;
		}
		items.remove(i);
	}
	
	public Item getItem(String name){
		int i=0;
		while((items.get(i).getName().equals(name)) && (i < items.size())){
			i++;
		}
		if(i < items.size()){
			return items.get(i);
		}
		else{
			return null;
		}
	}
	
	public ArrayList<String> getItemNames(){
		ArrayList<String> returnList = new ArrayList<String>();
		for(int i=0; i<items.size(); i++){
			returnList.add(items.get(i).getName());
		}
		return returnList;
		
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
