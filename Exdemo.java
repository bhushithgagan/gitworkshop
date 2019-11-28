import java.util.*;
class WrongAge extends Exception {
	String s;
	WrongAge(){ }
	WrongAge(String des) {
	s = des;
	}
	public String toString() {
	return s;
	}
}

class Father {
    int a;
	Father () throws WrongAge{
	System.out.println("Enter Age of Father : ");
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	if(a<=0)
	throw new WrongAge("Wrong age!");
	}
}

class Son extends Father {
    int b;
	Son () throws WrongAge{
	super();
	System.out.println("Enter Age of  Son : ");
	Scanner sc = new Scanner(System.in);
	b = sc.nextInt();
	if(a<b||a==b) {
	throw new WrongAge("Son's age greater than father OR equals father's age, INVALID ENTRY!");
	}
	System.out.println("Entered Age of Father: " + a + "\nEntered age of Son: " + b);
	}
}




public class Exdemo {
	public static void main(String args[]) {
	try{
	Son ob1 = new Son();
	}
	catch(WrongAge e) {
	System.out.println(e);
	}
	}
}
	
