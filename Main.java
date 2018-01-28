import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

class Main {
	static PhysicsEngine e;
	static Player p;
	public static void init() {
		p = new Player(new Point(0,0),8,8);
		e = new PhysicsEngine();
	}
	public static void main(String[] args) {
		init();
		while(true) {

			p.debug();
			readIO();
			e.verifyStack();
			e.commitStack();
			
		}
	}
	
	
	
	
	
	public static void  readIO() {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().toLowerCase().charAt(0);
		String lst = "daws";
	
		if(c == 'd') {
			p.xAcc += 5;
		}
		if(c == 'a') {
			p.xAcc -= 5;
		}
		if(c == 'w') {
			p.yAcc += 5;
		}
		if(c == 's') {
			p.yAcc -= 5;
		}
		
		if (lst.contains(String.valueOf(c))) {
			e.verificationStack.push(p);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	public static void init() {
//		Player p = null;//new Player(new Point(0,0),8,8);
//		PhysicsEngine e = new PhysicsEngine();
//	}
//	public static void  readIO() {
//		Scanner sc = new Scanner(System.in);
//		char c = sc.next().toLowerCase().charAt(0);
//
//		if(c == 'w') {
//			System.out.println("W");
//		}
//		
//	}
//	public void checkHeap() {
//		
//	}
//    public static void main(String[] args) {
//    	init();
//    	while(1==1) {
//    		readIO();
//    		//p.debug();
//    	}
//    	
//        
//    }
}