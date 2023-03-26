/**
 * @(#)Computer.java
 *
 *
 * @author 
 * @version 1.00 2017/2/8
 */


public class Computer {
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
    public Computer() {
    }
    
    
}