/**
 * @(#)Loan.java
 *
 *
 * Callum Pope
 * 2017/3/8
 *Loan super class where attributes and methods will be declared
 */


public class Loan {
	//attributes
	private String typeOfLoan; //either SEC for secured or UNSEC for unsecured.
	private int amount; //price of loan
	private int duration; //Number of years it will take to pay the loan back
	
	//constructors
    public Loan() {
    }
    public Loan(String typeOfLoan, int amount, int duration) {
    	setTypeOfLoan(typeOfLoan);
    	setAmount(amount);
    	setDuration(duration);
    }
    //set methods
    public void setTypeOfLoan(String typeOfLoan){
    	this.typeOfLoan = typeOfLoan;
    }
    public void setAmount(int amount){
    	this.amount = amount;
    }
    public void setDuration(int duration){
    	this.duration = duration;
    }
    //get methods
    public String getTypeOfLoan(){
    	return this.typeOfLoan;
    }
    public int getAmount(){
    	return this.amount;
    }
    public int getDuration(){
    	return this.duration;
    } 
}