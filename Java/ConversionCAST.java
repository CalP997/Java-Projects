/**
 * @(#)ConversionCAST.java
 *
 *
 * @author 
 * @version 1.00 2016/11/2
 */

public class ConversionCAST {
        
    /**
     * Creates a new instance of <code>ConversionCAST</code>.
     */
    public ConversionCAST() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c = 'A';
        int i = 100;
        float f = 3000000000.00f;
        double d = 200.00;
        
        c = (char) i; //use casts
        System.out.println("Value of i after cast to c is " + i);
        
        i = (int) f; //float rounded down to max int value of 2147483647
        System.out.println("Value of f after cast to i is " + f);
        
        i = (int) d; //should = 200 with no dps
        System.out.println("Value of d after cast to i is " + i);
    }
}
