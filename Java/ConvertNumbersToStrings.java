/**
 * @(#)ConvertNumbersToStrings.java
 *
 *
 * @author 
 * @version 1.00 2016/11/2
 */

public class ConvertNumbersToStrings {
        
    /**
     * Creates a new instance of <code>ConvertNumbersToStrings</code>.
     */
    public ConvertNumbersToStrings() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "100";
        int i = 0;
        float f = 0;
        double d = 0;
        
        // s = (String) i; will not work
        
s = Integer.toString(i);     
System.out.println("Value of i" + i);

s = Float.toString(f);
System.out.println("Value of f " + f);

s = Double.toString(d);
System.out.println("Value of d " + d);
}
}