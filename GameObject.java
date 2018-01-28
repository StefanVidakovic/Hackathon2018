

import java.awt.image.BufferedImage;

public class GameObject {
	int objId = 0;
	Point bottomLeftCorner;
	Point topLeftCorner;
	Point bottomRightCorner;
	Point topRightCorner;
	
	Point newbottomLeftCorner;
	Point newbottomRightCorner;
	Point newtopLeftCorner;
	Point newtopRightCorner;
	
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
	public void updateObject(Point bottomLeft) {
		this.bottomLeftCorner = new Point(bottomLeft.x,bottomLeft.y);
		this.topLeftCorner = new Point(bottomLeft.x,bottomLeft.y + this.ysize);
		this.bottomRightCorner = new Point(bottomLeft.x + this.xsize,bottomLeft.y);
		this.topRightCorner = new Point(bottomLeft.x + this.xsize,bottomLeft.y+this.ysize);
	}

	public double getxVel() {
		return this.xVel;
	}
	public double getyVel() {
		return this.yVel;
	}
	public double getxAcc() {
		return this.xAcc;
	}
	public double getyAcc() {
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
	public void setnewBottomLeft(Point p) {
		this.newbottomLeftCorner = p;
	}
	public void setnewBottomRight(Point p) {
		this.newbottomRightCorner = p;
	}
	public void setnewTopLeft(Point p) {
		this.newtopLeftCorner = p;
	}
	public void setnewTopRight(Point p) {
		this.newtopRightCorner = p;
	}
	public Point getnewBottomLeft() {
		return this.newbottomLeftCorner;
	}
	public Point getnewTopLeft() {
		return this.newtopLeftCorner;
	}
	public Point getnewBottomRight() {
		return this.newbottomRightCorner;
	}
	public Point getnewTopRight() {
		return this.newtopRightCorner;
	}

}
