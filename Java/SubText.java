/**
 * @(#)SubText.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */
import java.util.Scanner;
public class SubText {
        
    /**
     * Creates a new instance of <code>SubText</code>.
     */
    public SubText() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s1 = "Liverpool";
    String s2;
    String s3;
    s2 = s1.substring(5,9); //Extract pool
    s3 = s1.substring(0,5); //Extract liver
    System.out.println("I lost my " + s3 + " in a " + s2);
    }
}
