/**
 * @(#)Computer.java
 *
 *
 * @author 
 * @version 1.00 2017/2/8
 */


public class Computer {
	final int MAXRAM = 16;
    	//constructors 
    	//default constructor
    	public Computer(){
    	}
    	public Computer(String m){
    		setManufacturer(m);
    	}
    	//using the this keyword
    	public Computer(String manufacturer, int RAM, int noofprocessors, String OS){
    		setManufacturer(manufacturer);
    		setRAM(RAM);
    		setNoofprocessors(noofprocessors);
    		setOS(OS);
    	}
    
    		//attributes
private String manufacturer;
private int RAM;
private int noofprocessors;
private String OS;
//set/get methods 
public void setManufacturer(String manufacturer){
	if ( manufacturer.startsWith("MAC") || manufacturer.startsWith("Toshiba")){
		this.manufacturer = manufacturer;
	}else{
		this.manufacturer = "Not supported";
	}
	this.manufacturer = manufacturer;
}
public void setRAM(int RAM){
	if ( RAM > MAXRAM ){
		this.RAM = 0;
		System.out.println("Exceeded maximum RAM");
	}else{
		this.RAM = RAM;
	}
	this.RAM = RAM;
}
public void setNoofprocessors(int noofprocessors){
	this.noofprocessors = noofprocessors;
}
public void setOS(String OS){
	this.OS = OS;
}
public String getManufacturer(){
	return this.manufacturer;
}
public int getRAM(){
	return this.RAM;
}
public int getNoofprocessors(){
	return this.noofprocessors;
}
public String getOS(){
	return this.OS;
}

//methods
public void print() {
	System.out.println(manufacturer);
	System.out.println("RAM " + RAM + "Gbs");
	System.out.println("No of processors " + noofprocessors);
	System.out.println("OS" + OS);
	}
    
    
}