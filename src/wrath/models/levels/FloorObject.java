package wrath.models.levels;

import android.graphics.Bitmap;

public class FloorObject {
	
	private boolean isWalkable;
	private Bitmap floorImage;
		
	public FloorObject(Bitmap bmp){
		this.setFloorImage(bmp);
	}

	public boolean isWalkable() {
		return isWalkable;
	}

	public void setWalkable(boolean isWalkable) {
		this.isWalkable = isWalkable;
	}

	public Bitmap getFloorImage() {
		return floorImage;
	}

	public void setFloorImage(Bitmap floorImage) {
		this.floorImage = floorImage;
	}

}
