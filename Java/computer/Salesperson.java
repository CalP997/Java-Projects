/**
 * @(#)Salesperson.java
 *
 *
 * @author 
 * @version 1.00 2017/3/1
 */


public class Salesperson extends Employee implements Taxable {
//attributes
private float commissionrate;

//contructors
    public Salesperson() {
    }
    public Salesperson(String firstname, String surname, String jobdescription, float salary, float commissionrate){
    	super(firstname, surname,jobdescription, salary);
    	setCommissionRate(commissionrate);
    }
    //methods
    public boolean isTaxReturnComplete(){
    	return true;
    }
    public void setCommissionRate(float commissionrate){
    	return this.commissionrate;
    }
    public void getCommissionRate(){
    	return this.commissionrate;
    }
    public void print(){
    	super.print();
    	System.out.println("Commission rate " + commissionrate);
    	System.out.println("");
    }
    
    
}