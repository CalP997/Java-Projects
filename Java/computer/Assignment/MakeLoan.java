/**
 * @(#)MakeLoan.java
 *
 *
 * Callum Pope
 * 2017/3/14
 *Main class that will create loans, both secured and unsecured
 */
import java.util.Scanner;
public class MakeLoan { 
       int choice;

    public static void main(String[] args) {
        MakeLoan ml = new MakeLoan();//create a new loan application
        ml.start();
    }
    
    public void start()
    	{
    	do{
    	Scanner scan = new Scanner (System.in);
    	String typeOfLoan = "";//initialisation
    	System.out.println("Do you want a secured (SEC) or unsecured (UNSEC) loan? ");
    	typeOfLoan  = scan.next();
    	switch (typeOfLoan){
    		case "SEC":
    			secLoan();//continues with the secured loan function
    			break;
    		case "UNSEC":
    			unsecLoan();//continues with the unsecured loan function
    			break;
    		default:
    			System.out.println("Invalid type");
   				break;
    	}
    	System.out.println("Complete another loan application [1 = yes /2 = no]");//allows for the other loans to be made
    	try{
    		choice = scan.nextInt();}
    	catch(Exception e){
    		System.out.println("Invalid Number");
    		choice = 2;//forced exit of the program
    	}
    	
    	}while( choice != 2 );//continues to create another application while choice is not 2(No)
    	}
    public void secLoan(){
    	Scanner scan = new Scanner(System.in);
    	int amount = 0;//initialisation of values
    	int duration = 0;
    	int houseValue = 0;
    	//get details
    	System.out.println("Enter amount ");
    	try{
    		amount = scan.nextInt();}
    	catch(Exception f){
    		System.out.println("Invalid amount");//catches any non integer characters
    	}
    	System.out.println("Enter duration (Years) ");
    	try{
    		duration = scan.nextInt();}
    	catch(Exception g){
    		System.out.println("Invalid duration");
    	}
    	System.out.println("Enter value of current property ");
    	try{
    		houseValue = scan.nextInt();}
    	catch(Exception h){
    		System.out.println("Invalid value");
    	}
    	
    	//create loan
    	SecuredLoan s1 = new SecuredLoan(amount, duration, houseValue);
    	
    	//is it valid
    	if (s1.ValidLoan()){
    		if ((amount <= houseValue * 0.2) & (houseValue >= 50000)){//min house value and loan has to be at least 20% of house value
    			System.out.println("Secured loan application successful");
    		}else{
    			System.out.println("Secured loan application rejected");
    	}
    }else{
    	System.out.println("Secured loan application rejected");
    }
    }
    public void unsecLoan(){
    		Scanner scan = new Scanner(System.in);
    		int amount = 0;//initialisation
    		int duration = 0;
    	//get details
    			System.out.println("Enter amount ");
    			try{
    				amount = scan.nextInt();}
    			catch(Exception i){
    				System.out.println("Invalid amount");
    			}
    			System.out.println("Enter duration (Years) ");
    			try{
    				duration = scan.nextInt();}
    			catch(Exception j){
    				System.out.println("Invalid duration");
    			}
    			System.out.println("Enter card number ");
    			String cardNumber = scan.next();
    			System.out.println("Length of card number is " + cardNumber.length());
    			if (cardNumber.length() != 8){//test to see if length is correct
    				System.out.println("Incorrect card length. Should be 8 digits");
    			}else{
    				System.out.println("Correct length");
    			}
    			System.out.println("Enter bank number ");
    			String bankNumber = scan.next();
    			System.out.println("Length of bank number is " + bankNumber.length());
    			if (bankNumber.length() != 8){//test to see if length = 8
    				System.out.println("Incorrect bank number length. Should be 8 digits");
    			}else{
    				System.out.println("Correct length");
    		
    			}			
    	
    		
    	//create loan
    	UnsecuredLoan usl = new UnsecuredLoan(amount, duration, cardNumber, bankNumber);
    
    	
    	//is it valid
    	if(usl.ValidLoan1()){
    	System.out.println("Unsecured loan application accepted");
    }else{
    	System.out.println("Unsecured loan application rejected");
    }
    }
    }


