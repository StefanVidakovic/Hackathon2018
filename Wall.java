
public class Wall extends InanimateObject implements Interactable {
	public Wall(Point bottomLeft,int xsize,int ysize) {
		super(bottomLeft,xsize,ysize);
	}
	
	@Override
	public void interact(Interactable sender, Interactable reciver) {
		// TODO Auto-generated method stub
		
	}
	
	public void interact(GameObject player) {
		player.setxAcc(0);
		player.setxVel(0);
	}
	
}
