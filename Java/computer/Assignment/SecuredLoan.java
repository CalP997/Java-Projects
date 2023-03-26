/**
 * @(#)SecuredLoan.java
 *
 *
 * Callum Pope
 * 2017/3/10
 *Secured Loan subclass
 */


public class SecuredLoan extends Loan {
private int houseValue;
//constructors
    public SecuredLoan() {
    }
    public SecuredLoan(int amount, int duration, int houseValue) {
    	super("SEC", amount, duration);//gets info from the loan superclass
    	setHouseValue(houseValue);
    }
    //method to check validity of loan
    //yes, loan is valid or no, loan is not valid
    public boolean ValidLoan(){
    	if(getHouseValue() > 0){
    		return true;
    	}else{
    		return false;
    	}
    }
    //set method
    public void setHouseValue(int houseValue){
    	this.houseValue = houseValue;
    }
    //get method
    public int getHouseValue(){
    	return this.houseValue;
    }
    
    
}