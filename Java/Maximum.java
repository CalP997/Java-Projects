/**
 * @(#)Maximum.java
 *
 *
 * @author 
 * @version 1.00 2016/10/12
 */
import java.util.Scanner;
public class Maximum {
        
    /**
     * Creates a new instance of <code>Maximum</code>.
     */
    public Maximum() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int max;
        int total = 0;
        
        System.out.println("Enter number between 200 and 500 ");
        max = scan.nextInt();
        
        if ( ( max < 200) || ( max > 500)){
        	System.out.println("Number out of range ");
        } else{
        	for ( int i = 100; i < max; i++){
        		total = total + i;
        	}
        	System.out.println("Sum of numbers between 100 and " + max + " = " + total);
        }
    }
}
