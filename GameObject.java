

import java.awt.image.BufferedImage;

public class GameObject {
	int objId = 0;
	Point bottomLeftCorner;
	Point topLeftCorner;
	Point bottomRightCorner;
	Point topRightCorner;
	int xsize;
	int ysize;
	
	double xVel = 0;
	double yVel = 0;
	double xAcc = 0;
	double yAcc = 0;
	
	Object imgSprite = null;
	
	public void debug() {
		System.out.println(this);
		System.out.println("XCord: " + bottomLeftCorner.x + " | XVel: " + xVel + " | XAcc: " + xAcc);
		System.out.println("YCord: " + bottomLeftCorner.y + " | YVel: " + yVel + " | YAcc: " + yAcc);

	}
	
	public GameObject(Point bottomLeft,int xsize,int ysize) {
		this.bottomLeftCorner = new Point(bottomLeft.x,bottomLeft.y);
		this.topLeftCorner = new Point(bottomLeft.x,bottomLeft.y + ysize);
		this.bottomRightCorner = new Point(bottomLeft.x + xsize,bottomLeft.y);
		this.topRightCorner = new Point(bottomLeft.x + xsize,bottomLeft.y+ysize);
		
	}
	
}
