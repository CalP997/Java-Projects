/**
 * @(#)ValidDay.java
 *
 *
 * @author 
 * @version 1.00 2016/11/9
 */
import java.util.Scanner;
public class ValidDay {
        
    /**
     * Creates a new instance of <code>ValidDay</code>.
     */
    public ValidDay() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String day = "";
        System.out.println("enter day");
        day = scan.next();
        day = day.toUpperCase();
        
        switch (day) {
        	case "MONDAY":
        	case "TUESDAY":
        	case "WEDNESDAY":
        	case "THURSDAY":
        	case "FRIDAY":
        	case "SATURDAY":
        	case "SUNDAY":
        		System.out.println("valid day");
        		break;
        	default:
        		System.out.println("invalid day");
        }
    }
}
