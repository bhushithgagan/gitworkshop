import java.util.*;
interface safedriving {
	int safespeed = 40;
	void speedofvehicle();
}

class Drive implements safedriving{
	Scanner sc = new Scanner(System.in);
	public void speedofvehicle() {
	System.out.println("Enter the speed of the vehicle: ");
	int s = sc.nextInt();
	if(s<=safespeed)
	 System.out.println("Safe Driving!\n");
	else if (s>safespeed)
	 System.out.println("Drive Slow!\n");
	else
	 System.out.println("INVALID ENTRY!\n");
	 }
}

class Interfacedrive {
	public static void main(String args[]) {
	Drive ob = new Drive();
	ob.speedofvehicle();
	}
}

