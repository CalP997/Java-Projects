/**
 * @(#)ReplaceVowels.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */
import java.util.Scanner;
public class ReplaceVowels {
        
    /**
     * Creates a new instance of <code>ReplaceVowels</code>.
     */
    public ReplaceVowels() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1;
        String newCity;
        System.out.println("Enter the name of your city, country etc");
        s1 = scan.next();
        //chain methods
        newCity = s1.replace('a','z').replace('e','y').replace('i','x').replace('o','w').replace('u','t');
        System.out.println("New City = " + newCity);
    }
}
