/**
 * @(#)MathError.java
 *
 *
 * @author 
 * @version 1.00 2016/11/9
 */
import java.util.Scanner;
public class MathError {
        
    /**
     * Creates a new instance of <code>MathError</code>.
     */
    public MathError() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        float number1 = 0;
        float number2 = 0;
        
        try{
        	System.out.println("enter number1");
        	number1 = scan.nextInt();
        	
        	System.out.println("enter number2");
        	number2 = scan.nextInt();
        }catch (Exception e){
        	System.out.println("error");
        }
        number1 = number1 / number2;
        System.out.println(number1);
    }
}
