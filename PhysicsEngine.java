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
		while(!verificationStack.isEmpty()) {
			/*
			 * CHECK FOR COLLISION
			 */

			
			commitStack.push(verificationStack.pop());
		}
	}
	public void commitStack() {
		while(!commitStack.isEmpty()) {
			GameObject t = commitStack.pop();
			Point newPoint = calculateCords(t);
			t.bottomLeftCorner = newPoint;

			if(Math.abs(t.xAcc) > 0.4){
				t.xAcc /= 2;
				commitStack.push(t);
			}
			else if(Math.abs(t.yAcc) > 0.4) {
				t.yAcc /= 2;
				commitStack.push(t);
			}
			t.debug();
			/*
			 * Send to GFX to update
			 */
			 
		}
	}
	
	
	
	
	
	
	
	
	
	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	public PhysicsEngine() {
//		Deque<GameObject> toDo = new ArrayDeque<GameObject>();
//		Deque<GameObject> toUpdate = new ArrayDeque<GameObject>();
//	}
//	
//	public boolean intersecting(GameObject obj1, GameObject obj2) {
//		if(obj1.bottomLeftCorner.compareTo(obj2.bottomLeftCorner)>0
//				&&(obj1.topLeftCorner.compareTo(obj2.bottomLeftCorner)<0
//						&&obj1.bottomRightCorner.compareTo(obj2.bottomLeftCorner)<0)) {
//			return true;
//		}
//		if(obj1.bottomLeftCorner.compareTo(obj2.bottomRightCorner)>0
//				&&(obj1.topLeftCorner.compareTo(obj2.bottomRightCorner)<0
//						&&obj1.bottomRightCorner.compareTo(obj2.bottomRightCorner)<0)) {
//			return true;
//		}
//		if(obj1.bottomLeftCorner.compareTo(obj2.topLeftCorner)>0
//				&&(obj1.topLeftCorner.compareTo(obj2.topLeftCorner)<0
//						&&obj1.bottomRightCorner.compareTo(obj2.topLeftCorner)<0)) {
//			return true;
//		}
//		if(obj1.bottomLeftCorner.compareTo(obj2.topRightCorner)>0
//				&&(obj1.topLeftCorner.compareTo(obj2.topRightCorner)<0
//						&&obj1.bottomRightCorner.compareTo(obj2.topRightCorner)<0)) {
//			return true;
//		}
//		
//		return false;
//	}
//	public boolean calculateNewLocation(GameObject a) {
//		//Return true, if need updateing.
//		//False if unchanged.
//		return false;
//	}
//	
//	public void updateAll() {
//		
//	}
}
