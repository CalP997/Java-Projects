/**
 * data types dont need conversion
 * @version 1.00 2016/11/2
 */

public class NoConversionNeeded {
        
    /**
     * Creates a new instance of <code>NoConversionNeeded</code>.
     */
    public NoConversionNeeded() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c = 'A';
        int i = 100;
        float f = 100.00f;
        double d = 200.00;
        
        i = c; //int to char conversion
        System.out.println("value of i " + i );
        
        f = i; //int to float conversion
        System.out.println("Value of f " + f );
        
        d = i; //double to int convesion
        System.out.println("Value of d " + d );
        
        d = f; //double to float convesion
        System.out.println("Value of d " + d );
    }
}
