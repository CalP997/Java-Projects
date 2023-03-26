/**
 * @(#)DaySwitch.java
 *switch statement to print out user written number that mattches to a day of the week
 *if not declared return unknown
 * Callum
 *  2016/10/12
 */
import java.util.Scanner;
public class DaySwitch {
        
    /**
     * Creates a new instance of <code>DaySwitch</code>.
     */
    public DaySwitch() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
   Scanner scan = new Scanner (System.in);
   int day;
   
   System.out.println ("Enter day of the week 0 - 6");
   day = scan.nextInt();
   	
   	switch (day) {
   	
   		case 0:
   			System.out.println("Monday");
   			break;
   		case 1:
   			System.out.println("Tuesday");
   			break;
   		case 2:
   			System.out.println("Wednesday");
   			break;
   		case 3:
   			System.out.println("Thursday");
   			break;
   		case 4:
   			System.out.println("Friday");
   			break;
   		case 5:
   			System.out.println("Saturday");
   			break;
   		case 6:
   			System.out.println("Sunday");
   			break;
   		default:
   				System.out.println("Unknown day");
   				break;
   			
   	}
   			
    }
}
