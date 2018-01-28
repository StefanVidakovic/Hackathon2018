import java.util.ArrayDeque;
import java.util.Deque;

public class PhysicsEngine {
	Deque<GameObject> verificationStack = new ArrayDeque<GameObject>();
	Deque<GameObject> commitStack = new ArrayDeque<GameObject>();

	public void verifyStack() {
		while(!verificationStack.isEmpty()) {
			/*
			 * CHECK FOR COLLISION
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
