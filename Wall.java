package hack2018;
public class Wall extends InanimateObject implements Interactable {
	public Wall(Point bottomLeft,int xsize,int ysize) {
		super(bottomLeft,xsize,ysize);
	}
	
	@Override
	public void interact(Interactable sender, Interactable reciver) {
		// TODO Auto-generated method stub
		
	}
}
