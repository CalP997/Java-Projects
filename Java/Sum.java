/**
 * @(#)Sum.java
 *
 *
 * @author 
 * @version 1.00 2016/10/12
 */

public class Sum {
        
    /**
     * Creates a new instance of <code>Sum</code>.
     */
    public Sum() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int total = 0;
       for (int i = 1; i < 11 ; i++ ){
       	
       	System.out.println(i);
       	
       	total = total + i;
       }
       System.out.println("Total = " + total);
    }
}
