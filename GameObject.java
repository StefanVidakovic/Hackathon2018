

import java.awt.image.BufferedImage;

public class GameObject {
	int objId = 0;
	Point bottomLeftCorner;
	Point topLeftCorner;
	Point bottomRightCorner;
	Point topRightCorner;
	int xsize;
	int ysize;
	
	int xVel = 0;
	int yVel = 0;
	int xAcc = 0;
	int yAcc = 0;
	
	Object imgSprite = null;
	
	public GameObject(Point bottomLeft,int xsize,int ysize) {
		this.topLeftCorner = new Point(bottomLeft.x,bottomLeft.y + ysize);
		this.bottomRightCorner = new Point(bottomLeft.x + xsize,bottomLeft.y);
		this.topRightCorner = new Point(bottomLeft.x + xsize,bottomLeft.y+ysize);
		
	}
	public int getxVel() {
		return this.xVel;
	}
	public int getyVel() {
		return this.yVel;
	}
	public int getxAcc() {
		return this.xAcc;
	}
	public int getyAcc() {
		return this.yAcc;
	}
	public void setxVel(int vel) {
		this.xVel = vel;
	}
	public void setyVel(int vel) {
		this.yVel = vel;
	}
	public void setxAcc(int acc) {
		this.xAcc = acc;
	}
	public void setyAcc(int acc) {
		this.yAcc = acc;
	}
	
}
