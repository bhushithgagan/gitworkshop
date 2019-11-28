package CIE;
import java.util.*;

public class Internals extends Studentpkg {
	public int mark[] = new int[5];
	public Internals() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks in CIE of 5 Subjects: \n");
	for(int i = 0;i<5;i++) {
	mark[i] = sc.nextInt();
	}
	}
	public void disp () {
	for(int i = 0;i<5;i++){ 
		System.out.println("CIE Marks of sub " + (i+1) + ": " + mark[i]);
	}
	}
}

	
