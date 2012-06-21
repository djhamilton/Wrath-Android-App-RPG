package wrath.models.levels;

public class Room {
	private FloorObject[][] floorMatrix = new FloorObject[11][11];
	//N, S, E, W
	private boolean walkways[] = new boolean[4];
	private boolean isCurrentRoom;
	
	public Room(){
		for(int i=0; i<walkways.length; i++){
			walkways[i] = false;
		}
		setCurrentRoom(false);
	}
	
	public void setNorth(){
		walkways[0] = true;
		floorMatrix[0][5].setWalkable(true);
	}
	
	public void setSouth(){
		walkways[1] = true;
		floorMatrix[11][5].setWalkable(true);
	}
	
	public void setEast(){
		walkways[2] = true;
		floorMatrix[5][11].setWalkable(true);
	}
	
	public void setWest(){
		walkways[3] = true;
		floorMatrix[5][0].setWalkable(true);
	}
	
	public void createWalls(){
		for(int i=0; i<floorMatrix.length; i++){
			for(int j=0; j<floorMatrix.length; j++){
				if(i == 0 || j == 0 || i == floorMatrix.length || j == floorMatrix.length){
					floorMatrix[i][j].setWalkable(false);
					//MUST ALSO MAKE THESE TILES HOLLOW
					//floorMatrix[i][j].setFloorImage(SolidWallImage);
				}
			}
		}
	}
	
	public FloorObject[][] getFloorMatrix() {
		return floorMatrix;
	}

	public void setFloorMatrix(FloorObject[][] floorMatrix) {
		this.floorMatrix = floorMatrix;
	}

	public boolean isCurrentRoom() {
		return isCurrentRoom;
	}

	public void setCurrentRoom(boolean isCurrentRoom) {
		this.isCurrentRoom = isCurrentRoom;
	}
	
	public FloorObject getFloorObject(int x, int y){
		return floorMatrix[y][x];
	}
	
	public void setFloorObject(FloorObject floorObject, int x, int y){
		floorMatrix[y][x] = floorObject;
	}

	public boolean[] getWalkways() {
		return walkways;
	}

	public void setWalkways(boolean walkways[]) {
		this.walkways = walkways;
	}
	
}
