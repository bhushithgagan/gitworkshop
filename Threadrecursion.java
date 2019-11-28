import java.util.*;
class t1 implements Runnable {
	Thread t;
	t1() {
	t = new Thread(this,"t1");
	t.start();
	}
	public void run() {
	new t2();
	try {
	Thread.sleep(50);
	System.out.println("Hello! from thread 1\n");
	}
	catch(InterruptedException e) {
	System.out.println("Thread 1 ex");
	
	}
	}
}

class t2 implements Runnable {
	Thread t;
	t2() {
	t = new Thread(this,"t2");;
	t.start();
	}
	public void run() {
	new t3();
	try {
	Thread.sleep(40);
	System.out.println("Hello! from thread 2\n");
	}
	catch(InterruptedException e) {
	System.out.println("Thread 2 ex");
	}
	
	}
}

class t3 implements Runnable {
	Thread t;
	t3() {
	t = new Thread(this,"t3");
	t.start();
	}
	public void run() {
	new t4();
	try {
	Thread.sleep(30);
	System.out.println("Hello! from thread 3\n");
	}
	catch(InterruptedException e) {
	System.out.println("Thread 3 ex");
	
	}
	}
}

class t4 implements Runnable {
	Thread t;
	t4() {
	t = new Thread(this,"t4");
	t.start();
	}
	public void run() {
	new t5();
	try {
	Thread.sleep(20);
	System.out.println("Hello! from thread 4\n");
	}
	catch(InterruptedException e) {
	System.out.println("Thread 4 ex");
	}
	
	}
}

class t5 implements Runnable {
	Thread t;
	t5() {
	t = new Thread(this,"t5");
	t.start();
	}
	public void run() {
	try {
	Thread.sleep(10);
	System.out.println("Hello! from thread 5\n");
	}
	catch(InterruptedException e) {
	System.out.println("Thread 5 ex");
	
	}
	}
}

class Threadrecursion {
	public static void main (String args[]) {
	new t1();
	}
}	














