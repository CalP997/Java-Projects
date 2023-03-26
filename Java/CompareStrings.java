/**
 * @(#)CompareStrings.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */
import java.util.Scanner;
public class CompareStrings {
        
    /**
     * Creates a new instance of <code>CompareStrings</code>.
     */
    public CompareStrings() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1;
        String s2;
        System.out.println("Enter string 1");
        s1 = scan.next();
        System.out.println("Enter string 2");
        s2 = scan.next();
        //use equals method to compare
        if ( s1.equals(s2)){
        	System.out.println("Strings equal");
        }else{
        	System.out.println("Strings not equal");
        }
    }
}
