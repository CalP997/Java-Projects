/**
 * @(#)DoWhile1.java
 *
 *
 * @author 
 * @version 1.00 2016/10/12
 */

public class DoWhile1 {
        
    /**
     * Creates a new instance of <code>DoWhile1</code>.
     */
    public DoWhile1() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int count = 10;
        
        do {
        	System.out.println(count);
        	count--;
        }while ( count > 0 );
    }
}
