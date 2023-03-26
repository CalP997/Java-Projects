/**
 * @(#)Manager.java
 *
 *
 * @author 
 * @version 1.00 2017/1/25
 */


public class Saleperson extends Employee implements Taxable {
	//attributes
	private float commissionrate;
	//constructors
    public Saleperson() {
    }
    public Saleperson(String firstname, String surname, String jobdescription, double salary, float commissionrate){
    	super(firstname, surname, jobdescription, salary);
    	setCommissionrate(commissionrate);
    }
    //methods
    public boolean isTaxReturnComplete(){
    	return true;
    }
    public void setCommissionrate(float commissionrate){
    	this.commissionrate = commissionrate;
    }
    public float getCommissionrate(){
    	return this.commissionrate;
    }
    public void print(){
    	super.print();
    	System.out.println("Commission rate " + commissionrate);
    	System.out.println("");
    }
}