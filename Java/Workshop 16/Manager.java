/**
 * @(#)Manager.java
 *
 *
 * @author 
 * @version 1.00 2017/1/25
 */


public class Manager extends Employee implements Taxable {
	//attributes
	private String department;
	//constructors
    public Manager() {
    }
    public Manager(String firstname, String surname, String jobdescription, double salary, String department){
    	super(firstname, surname, jobdescription, salary);
    	setDepartment(department);
    }
    //methods
    public boolean isTaxReturnComplete(){
    	return true;
    }
    public void setDepartment(String department){
    	this.department = department;
    }
    public String getDepartment(){
    	return this.department;
    }
    public void print(){
    	super.print();
    	System.out.println("Department " + department);
    	System.out.println("");
    }
}