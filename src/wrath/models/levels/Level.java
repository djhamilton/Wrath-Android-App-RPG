package wrath.models.levels;

public class Level {
	private Room[][] roomMatrix;
	private boolean isNormalDifficulty;
	private int levelDifficulty;
	
	public Level(int difficulty, boolean normal){
		setLevelDifficulty(difficulty);
		isNormalDifficulty = normal;
		if(isNormalDifficulty){
			setRoomMatrix(new Room[difficulty*2][difficulty*2]);
		}
		else{
			setRoomMatrix(new Room[10][10]);
		}
	}

	public Room[][] getRoomMatrix() {
		return roomMatrix;
	}

	public void setRoomMatrix(Room[][] roomMatrix) {
		this.roomMatrix = roomMatrix;
	}

	public int getLevelDifficulty() {
		return levelDifficulty;
	}

	public void setLevelDifficulty(int levelDifficulty) {
		this.levelDifficulty = levelDifficulty;
	}
	
	public Room getRoom(int x, int y){
		return roomMatrix[y][x];
	}
	
	public void setRoom(Room room, int x, int y){
		roomMatrix[y][x] = room;
	}
}
