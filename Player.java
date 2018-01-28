

public class Player extends AnimateObject implements Interactable{
	int x;
	int y;
	Point cord;
	public Player(Point bottomLeft,int xsize,int ysize) {
		
		super(bottomLeft,xsize,ysize);
		this.cord = bottomLeft;
	}

	public void debug() {
		x = cord.x;
		y = cord.y;
		System.out.println("XCord: " + x + " | XVel: " + xVel + " | XAcc: " + xAcc);
		System.out.println("YCord: " + y + " | YVel: " + yVel + " | YAcc: " + yAcc);
	}
	public void move() {
		/*
		 * If w is pressed do something.
		 * If a is pressed do something.
		 * Etc...
		*/
	}

	public void interact(Interactable i) {
		// TODO 
		
	}


	@Override
	public void interact(Interactable sender, Interactable reciver) {
		// TODO Auto-generated method stub
		
	}

}
