/**
 * @(#)Laptop.java
 *
 *
 * @author 
 * @version 1.00 2017/2/8
 */


public class Laptop extends Computer{
final int maxbatterylife = 30;
    public Laptop() {
    }
    private int batterylife;
    	
    public void print(){
    	System.out.println("Class : Laptop");
    	System.out.println("Battery life " + batterylife);
    }
    
    public void setBatterylife(int batterylife){
    	if (batterylife > maxbatterylife){
    		this.batterylife = 0;
    		System.out.println("max battery life exceeded");
    	}else{
    		this.batterylife = batterylife;
    	}
    }
    
}