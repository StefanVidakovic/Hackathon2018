public class PhysicsEngine {

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
	
	public void updateAll() {
		
	}
}
