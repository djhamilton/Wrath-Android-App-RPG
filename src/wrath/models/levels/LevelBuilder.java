package wrath.models.levels;

public class LevelBuilder {
	
	private Level level;
	
	public LevelBuilder(){
		
	}
	
	public LevelBuilder(Level l){
		level = l;
	}
	
	
	//makes a default static level for testing purposes
	//only to be used with the default constructor
	public Level createDefaultLevel(){
		level = new Level(2, true);
		createEmptyRooms();
		for(int i=0; i<level.getRoomMatrix().length; i++){
			for(int j=0; j<level.getRoomMatrix().length; j++){
				Room r = new Room();
				r.createWalls();
			}
		}
		return level;
	}
	
	public void setDefaultLevel(){
		//row 0
		level.getRoomMatrix()[0][0].setEast();
		level.getRoomMatrix()[0][0].setWest();

		level.getRoomMatrix()[0][1].setWest();
		level.getRoomMatrix()[0][1].setSouth();

		level.getRoomMatrix()[0][2].setEast();
		level.getRoomMatrix()[0][2].setSouth();

		level.getRoomMatrix()[0][3].setSouth();
		level.getRoomMatrix()[0][3].setWest();
		
		//row 1
		level.getRoomMatrix()[1][0].setNorth();
		level.getRoomMatrix()[1][0].setSouth();
		level.getRoomMatrix()[1][0].setEast();

		level.getRoomMatrix()[1][1].setWest();
		level.getRoomMatrix()[1][1].setSouth();
		level.getRoomMatrix()[1][1].setEast();
		level.getRoomMatrix()[1][1].setNorth();

		level.getRoomMatrix()[1][2].setWest();
		level.getRoomMatrix()[1][2].setNorth();

		level.getRoomMatrix()[1][3].setNorth();
		
		//row 2
		level.getRoomMatrix()[2][0].setEast();
		level.getRoomMatrix()[2][0].setNorth();
		level.getRoomMatrix()[2][0].setSouth();

		level.getRoomMatrix()[2][1].setWest();
		level.getRoomMatrix()[2][1].setSouth();
		level.getRoomMatrix()[2][1].setEast();
		level.getRoomMatrix()[2][1].setNorth();

		level.getRoomMatrix()[2][2].setEast();
		level.getRoomMatrix()[2][2].setSouth();
		level.getRoomMatrix()[2][2].setWest();

		level.getRoomMatrix()[2][3].setWest();
		
		//row 3
		level.getRoomMatrix()[3][0].setEast();
		level.getRoomMatrix()[3][0].setNorth();

		level.getRoomMatrix()[3][1].setWest();
		level.getRoomMatrix()[3][1].setEast();
		level.getRoomMatrix()[3][1].setNorth();

		level.getRoomMatrix()[3][2].setEast();
		level.getRoomMatrix()[3][2].setNorth();
		level.getRoomMatrix()[3][2].setWest();

		level.getRoomMatrix()[3][3].setWest();
	}
	
	public Level createLevel(){
		//create empty rooms
		createEmptyRooms();
		//create the starting room
		//create the path to all of the rooms
		//create the floor objects in the rooms
		
		return level;
	}
	
	public void createEmptyRooms(){
		for(int i=0; i<level.getRoomMatrix().length; i++){
			for(int j=0; j<level.getRoomMatrix().length; j++){
				Room r = new Room();
				r.createWalls();
				level.setRoom(r, i, j);
			}
		}
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	

}
