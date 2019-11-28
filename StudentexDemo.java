import java.util.*;
	class StudentexDemo {
	public static void main(String args[]) {
	String usn,name;
	int marks[] = new int[5];
	try {
		if(args.length == 0 || args.length <0)
		throw new NoArgsException("Zero Arguments");
		}
	catch(NoArgsException e) {
	System.out.println(e);
		System.exit(0);
	}
	try {	
		name = args[0];
		usn = args[1];
		for(int i = 0;i<3;i++) {
		marks[i] = Integer.parseInt(args[i+2]);
		if(marks[i]<0)
		throw new NoArgsException("INVALID ENTRY TRY AGAIN! : (Negative marks)");
		}
	/*System.out.println("Enter USN and name:\n");
	Scanner sc = new Scanner(System.in);
	usn = sc.next();
	name  = sc.next(); */
	System.out.println("*** ENTERED DETAILS ***\n");
	System.out.println("Name: " + name + "\nUSN: " + usn);
	for(int i = 0;i<3;i++) {
	System.out.println("Subject " + (i+1) + ": " + marks[i]);
		}
	}
	catch(NoArgsException e) {
		System.out.println(e);
		}
	}
}

class NoArgsException extends Exception {
	String a;
	NoArgsException(String s) {
	a = s;
	}
	public String toString() {
	return a;
	}
}

		
	
