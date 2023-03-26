/**
 * @(#)Comp.java
 *
 *
 * @author 
 * @version 1.00 2017/2/8
 */


public class Comp {
    public Comp() {
    	//constructors 
    	//default constructor
    	Comp(){
    	}
    	Comp(String m){
    		manufacturer = m;
    	}
    	//using the this keyword
    	Comp(String manufacturer, int RAM, int noofprocessors, String OS){
    		this.manufacturer = manufacturer;
    		this. RAM = RAM;
    		this.noofprocessors = noofprocessors;
    		this.OS = OS;
    	}
    		//attributes
String manufacturer;
int RAM;
int noofprocessors;
String OS;

//methods
void print() {
	System.out.println(manufacturer);
	System.out.println("RAM " + RAM + "Gbs");
	System.out.println("No of processors " + noofprocessors);
	System.out.println("OS" + OS);
	}
    }
    
    
}