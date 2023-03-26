/**
 * @(#)FormatNumbers.java
 *
 *
 * @author 
 * @version 1.00 2016/11/2
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatNumbers {
        
    /**
     * Creates a new instance of <code>FormatNumbers</code>.
     */
    public FormatNumbers() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
System.out.println("Enter a number");

double d = scan.nextDouble();

//FORMAT NUMBERS WITH COMMA SEPERATORS
DecimalFormat dfl = new DecimalFormat("000,000,000.00");
System.out.println(dfl.format(d)) ;       
    }
}
