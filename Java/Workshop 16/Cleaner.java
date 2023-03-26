/**
 * @(#)Cleaner.java
 *
 *
 * @author 
 * @version 1.00 2017/3/1
 */


public class Cleaner {
	//attributes
	private float hourlyrate;
	//constructors
    public Cleaner() {
    }
    public Cleaner(String firstname, String surname, String jobdescription, double salary, float hourlyrate){
    	super(firstname, surname, jobdescription, 0);
    	setHourlyrate(hourlyrate);
    }
    //methods
    public void setHourlyrate(float hourlyrate){
    	this.hourlyrate = hourlyrate;
    }
    public float getHourlyrate(){
    	return this.hourlyrate;
    }
    public void print(){
    	super.print();
    	System.out.println("Hourly rate " + hourlyrate);
    	System.out.println(""); 
}