package SEE;
import CIE.*;
import java.util.*;



public class External extends Studentpkg{
    public float marks[];
    
    public External() {
        marks = new float[5];
        System.out.println("Enter SEE Marks");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) marks[i] = sc.nextFloat();
    }
    public void disp() {
    for(int i = 0;i<5;i++) System.out.println("SEE Marks of sub " + (i+1)+" : "+ marks[i]); 
    }
}
