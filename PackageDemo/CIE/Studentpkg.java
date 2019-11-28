package CIE;

import java.util.*;

public class Studentpkg {
    String name, usn;
    int sem;
    
    public Studentpkg() {
        System.out.println("Enter Name, USN, Sem");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        usn = sc.next();
        sem = sc.nextInt();
    }
}


