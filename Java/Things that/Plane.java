/**
 * @(#)Plane.java
 *
 *
 * @author 
 * @version 1.00 2017/2/15
 */


public class Plane implements Flight {
//attributes
private String name;

//constructors
    public Plane(String name) {
    	this.name = name;
    }
    //methods
    //must overload methods defined in flight interface
    public String MethodOfFlight(){
    	return "I use fixed wings + engines";
    }
    public void print(){
    	System.out.println(this.name);
    }
    
    
}