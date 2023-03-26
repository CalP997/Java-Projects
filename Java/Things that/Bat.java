/**
 * @(#)Bat.java
 *
 *
 * @author 
 * @version 1.00 2017/2/15
 */


public class Bat implements Flight {
private String name;

    public Bat(String name) {
    	this.name=name;
    }
    
    public String MethodOfFlight(){
    	return "I use wings of skin stretched between my fingers";
    }
    public void print(){
    	System.out.println(this.name);
    }
    
}