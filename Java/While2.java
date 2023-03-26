/**
 * @(#)While2.java
 *
 *
 * @author 
 * @version 1.00 2016/10/12
 */

public class While2 {
        
    /**
     * Creates a new instance of <code>While2</code>.
     */
    public While2() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int count = 1;
        int total = 0;
        
        while (count < 21 ) {
        	
        	total = count + count; count++;
        }
        System.out.println("The sum of numbers between 1 and 20 = " + total);
    }
}
