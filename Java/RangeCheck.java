/**
 * @(#)RangeCheck.java
 *
 *
 * @author 
 * @version 1.00 2016/11/9
 */
import java.util.Scanner;
public class RangeCheck {
        
    /**
     * Creates a new instance of <code>RangeCheck</code>.
     */
    public RangeCheck() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int MINIMUM = 1;
        final int MAXIMUM = 10;
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("enter number");
        num = scan.nextInt();
        if((num < MINIMUM) || (num > MAXIMUM)) {
        	System.out.println("number out of range");
        }else{
        	System.out.println("number in range");
        }
    }
}
