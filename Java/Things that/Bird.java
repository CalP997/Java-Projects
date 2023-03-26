/**
 * @(#)Bird.java
 *
 *
 * @author 
 * @version 1.00 2017/2/15
 */


public class Bird implements Flight {

   private String name;

    public Bird(String name) {
    	this.name=name;
    }
    
    public String MethodOfFlight(){
    	return "I use wings covered in feathers";
    }
    public void print(){
    	System.out.println(this.name);
    }
    
    
}