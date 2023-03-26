/**
 * @(#)UnsecuredLoan.java
 *
 *
 * Callum Pope 
 * 2017/3/14
 *Unsecured loan subclass can borrow a maximum of £10,000 without a property
 */


public class UnsecuredLoan extends Loan {
//attributes
private String cardNumber; 
private String bankNumber;

//constructors
    public UnsecuredLoan() {
    }
    public UnsecuredLoan(int amount, int duration, String cardNumber, String bankNumber) {
    	super("UNSEC", amount, duration);//gets info from the loan superclass
    	setCardNumber(cardNumber);
    	setBankNumber(bankNumber);
    }
 //Check to see if the loan is valid
    public boolean ValidLoan1(){
    	if(getAmount() <= 10000){//limit for unsecured loans
    		return true;
    	}else{
    		return false;
    	}
    }
	
	//set methods
	public void setCardNumber(String cardNumber){
		this.cardNumber = cardNumber;
	}	
	public void setBankNumber(String bankNumber){
		this.bankNumber = bankNumber;
	}	
	//get methods
	public String getCardNumber(){
		return this.cardNumber;
	}	
	public String getBankNumber(){
		return this.bankNumber;
	}
}	