/**
 * @(#)ArithmeticOperators.java
 *	callum
 *switch statement to print out declared arithmetic operator
 * 2016/10/12
 */

public class ArithmeticOperators {
        
    /**
     * Creates a new instance of <code>ArithmeticOperators</code>.
     */
    public ArithmeticOperators() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      char operator = '='; //declare any operator or otherwise to test
      
      switch (operator){
      	case '+':
      		System.out.println("plus sign");
      		break;
      	case '-':
      		System.out.println("minus sign");
      		break;
      	case '/':
      		System.out.println("divide sign");
      		break;
      	case '*':
      		System.out.println("multiply sign");
      		break;
      	case '%':
      		System.out.println("modulus/remainder sign");
      		break;
      	case '=':
      		System.out.println("Equals sign");
      		break;
      	default:
      		System.out.println("Unknown symbol");
      		break;
      	
      }
    }
}
