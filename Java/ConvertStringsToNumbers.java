/**
 * use wrapper class
 *Integer, Float, Double, Character, Byte
 *all have uppercase
 *takes string and converts to number
 */

public class ConvertStringsToNumbers {
        
    /**
     * Creates a new instance of <code>ConvertStringsToNumbers</code>.
     */
    public ConvertStringsToNumbers() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s = "100";
       int i = 0;
       float f = 0;
       double d = 0;
       
       //convert strings to equivilent numeric value
       //i = (int) s; this wont work
       i = Integer.parseInt(s); //must use appropriate number class
       System.out.println("Value of i " + i);
       
       f = Float.parseFloat(s);
       System.out.println("Value of f " + f);
       
       d = Double.parseDouble(s);
       System.out.println("Value of d " + d);
    }
}
