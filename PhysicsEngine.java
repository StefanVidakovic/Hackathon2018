import java.util.ArrayDeque;
import java.util.Deque;


public class PhysicsEngine {
	Deque<GameObject> verificationStack = new ArrayDeque<GameObject>();
	Deque<GameObject> commitStack = new ArrayDeque<GameObject>();


	public Point calculateCords(GameObject g) {
		int newX = g.bottomLeftCorner.x + (int) g.xAcc*4;
		int newY = g.bottomLeftCorner.y + (int) g.yAcc*4;
		return new Point(newX,newY);
	}
	public void verifyStack() {
		while(!verificationStack.isEmpty()) { //verfication stack should strictly contain GameObjects with "newCoordinates" assigned
			/*
			 * CHECK FOR COLLISION
			 */
			
			
			commitStack.push(verificationStack.pop());
		}
	}
	public void commitStack() {
		GameObject t = null;
		while(!commitStack.isEmpty()) {
			t = commitStack.pop();
			Point newPoint = calculateCords(t);
			t.updateObject(newPoint);

			/*
			 * Send to GFX to update
			 */
			 
		}
		if(t != null) {
			if(Math.abs(t.xAcc) > 0.4){
				t.xAcc /= 2;
				commitStack.push(t);
			}
			else if(Math.abs(t.yAcc) > 0.4) {
				t.yAcc /= 2;
				commitStack.push(t);
			}
			t.debug();
		}
	}
	
	public boolean intersecting(GameObject obstacle, GameObject player) {
		if(obstacle.bottomLeftCorner.compareTo(player.newbottomLeftCorner)>0 //this means obj2 is "greater"
				&&(obstacle.topLeftCorner.compareTo(player.newbottomLeftCorner)<0
						&&obstacle.bottomRightCorner.compareTo(player.newbottomLeftCorner)<0)) {
			return true;
		}
		if(obstacle.bottomLeftCorner.compareTo(player.newbottomRightCorner)>0
				&&(obstacle.topLeftCorner.compareTo(player.newbottomRightCorner)<0
						&&obstacle.bottomRightCorner.compareTo(player.newbottomRightCorner)<0)) {
			return true;
		}
		if(obstacle.bottomLeftCorner.compareTo(player.newtopLeftCorner)>0
				&&(obstacle.topLeftCorner.compareTo(player.newtopLeftCorner)<0
						&&obstacle.bottomRightCorner.compareTo(player.newtopLeftCorner)<0)) {
			return true;
		}
		if(obstacle.bottomLeftCorner.compareTo(player.newtopRightCorner)>0
				&&(obstacle.topLeftCorner.compareTo(player.newtopRightCorner)<0
						&&obstacle.bottomRightCorner.compareTo(player.newtopRightCorner)<0)) {
			return true;
		}
		
		return false;
	}
	
	public int side(GameObject player,GameObject obstacle){ //this is done from perspective of obstacle
		//left of obstacle
		if(player.bottomRightCorner.x<obstacle.bottomLeftCorner.x
				&&intersecting(obstacle, player)) {
			return 1;
		}
		//under obstacle
		if(player.topRightCorner.y<obstacle.bottomLeftCorner.y||player.topLeftCorner.y<obstacle.bottomLeftCorner.y
				&&intersecting(obstacle,player)) {
			return 2;
		}
		//right of obstacle
		if(player.bottomLeftCorner.x>obstacle.bottomRightCorner.x
				&&intersecting(obstacle,player)) {
			return 3;
		}
		//above obstacle
		if(player.bottomLeftCorner.y>obstacle.topRightCorner.y
				&&intersecting(obstacle,player)) {
			return 4;
		}
		return 0;
	}
	
	public boolean calculateNewLocation(GameObject a) {
		//Return true, if need updateing.
		//False if unchanged.
		return false;
	}
}
