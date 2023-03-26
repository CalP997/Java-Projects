/**
 * @(#)Employee.java
 *
 *
 * @author 
 * @version 1.00 2017/1/25
 */


public class Employee {
	//attributes
	private String firstname;
	private String surname;
	private String jobdescription;
	private double salary;
	
	//constructors
    public Employee() {
    }
    public Employee(String firstname, String surname, String jobdescription, double salary){
    	this.firstname = firstname;
    	this.surname = surname;
    	this.jobdescription = jobdescription;
    	this.salary = salary;
    }
    //methods
    public void setFirstname(String firstname){
    	this.firstname = firstname;
    }
    public String getFirstname(){
    	return this.firstname;
    }
     public void setSurname(String surname){
    	this.surname = surname;
    }
    public String getSurname(){
    	return this.surname;
    }
     public void setJobdescription(String jobdescription){
    	this.jobdescription = jobdescription;
    }
    public String getJobdescription(){
    	return this.jobdescription;
    }
     public void setSalary(double salary){
    	this.salary = salary;
    }
    public double getSalary(){
    	return this.salary;
    }
    
    //print attributes
    public void print(){
    	System.out.println("First name " + firstname);
    	System.out.println("Surname " + surname);
    	System.out.println("Job Description " + jobdescription);
    	System.out.println("Salary " + salary);
    }
    
    
}