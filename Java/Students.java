/**
 * @(#)Students.java
 *Callum
 *2016/10/5
 *write a program that will set a student number and assignment mark and display number and whether student has passed or failed
 */
import java.util.Scanner; 
public class Students {
    /**
     * Creates a new instance of <code>Students</code>.
     */
    public Students() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int PASS = 40;
        
        Scanner scan = new Scanner (System.in);
        int marks;
        
        System.out.println("Enter student mark");
        marks = scan.nextInt();
        
        if (marks >= PASS) {
        	System.out.println("Passed");
        } else {
        	System.out.println("Failed");
        }
    }
}
