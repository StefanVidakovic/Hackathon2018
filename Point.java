

public class Point implements Comparable<Point> {
	int x;
	int y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int compareTo(Point p) {
		if(p.x>this.x|p.y>this.y) {
			return 1;
		}
		else if(p.x<this.x|p.y<this.y) {
			return -1;
		}
		return 0;
	}
}
