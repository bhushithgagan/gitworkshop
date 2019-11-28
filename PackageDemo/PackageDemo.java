import CIE.*;
import SEE.*;
import java.util.*;

class PackageDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of students: \n");
		//int n = sc.nextInt();		
		//for (int i = 0; i < n; ++i) {
			Internals in = new Internals();
			External ex = new External();
			in.disp();
			ex.disp();
	//	}
	}
}
