import java.util.*;
class Bank {
	String name;
	int accno;
	double bal = 0,depamt,withamt;
	Scanner sc = new Scanner(System.in);
	Bank() {
	try {
		System.out.println("Enter name,account number and initial deposit amount: ");
		name = sc.next();
		accno = sc.nextInt();
		bal = sc.nextDouble();
		if (bal<2000) {
			throw new InsuffException("INVALID DEPOSIT AMOUNT! (min is 2000)\n");
			}
	}
	catch(InsuffException e) {
		System.out.println(e);
		System.exit(0);
		}
	}
	void deposit () {
		System.out.println("Enter deposit amount: \n");
		depamt = sc.nextDouble();
		bal = bal + depamt;
		System.out.println("Balance: " + bal);
		}
	void withdraw() {
	System.out.println("Enter withdrawal amount: \n");
	withamt = sc.nextDouble();
	try {
		if(withamt>=bal || bal<=2000) {
			throw new InsuffException("INSUFFICIENT BALANCE! OR WITHDRAWAL AMOUNT GREATER THAN MINIMUM BALANCE (2000)!");
			//System.exit(0);
			}
		bal = bal - withamt;
		System.out.println("Balance: " + bal);
	}
	catch(InsuffException e) {
		System.out.println(e);
		System.exit(0);
		}
	}
}

class InsuffException extends Exception {
	String a;
	InsuffException(String s) {
	a = s;
	}
	public String toString() {
	return a;
	}
}

class Bankex {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		Bank ob = new Bank();
		while(true) {
		System.out.println("Enter 1 to Deposit 2 for Withdrawal: \n");
		int n = sc.nextInt();
		if(n==1) ob.deposit();
		else if(n==2) ob.withdraw();
		else System.out.println("INVALID ENTRY!\n");
		}
	}
} 
