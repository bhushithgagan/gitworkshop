import java.util.*;
class t1 implements Runnable {
	Thread t;
	t1() {
	t = new Thread(this,"t1");
	t.start();
	}
	public void run () {
	while(true) {
	try {
	System.out.println("BMSCE");
	Thread.sleep(10000);
	}
	catch(InterruptedException e) {
	System.out.println("BMS Exception");
	}
	}
	}
}

class t2 implements Runnable {
	Thread t;
	t2() {
	t = new Thread(this,"t2");
	t.start();
	}
	
	public void run () {
	while(true) {
	try {
	System.out.println("CSE");
	Thread.sleep(2000);
	}
	catch(InterruptedException e) {
	System.out.println("CSE Exception");
	}
	}
	}
}

class Threadbmscse1 {
	public static void main(String args[]) {
	new t1();
	new t2();
	}
}

