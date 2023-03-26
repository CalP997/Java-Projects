/**
 * @(#)MyStats2.java
 *
 *
 * @author 
 * @version 1.00 2016/9/21
 */


import java.util.Scanner

public class MyStats2 {

    public static void main(String[] args) {
    	
    //define variables
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int age;
    	double height;
    	double weight;
    	boolean bank;
    	
    //ask for data
    
    	System.out.println("Enter your age in years");
    	age = scan.nextInt();
    	
    	System.out.println("Enter your height in metres");
    	height = scan.nextDouble();
    	
    	System.out.println("Enter your weight in kilos");
    	weight = scan.nextDouble();
    	
    	System.out.println("Do you have a bank account?");
    	bank = scan.nextBoolean();
    	
    //print results
    	
    	System.out.println("you are " + age + " years old");
    	System.out.println("you are " + height + " metres");
    	System.out.println("you are " + weight + " kilos");
    	System.out.println("Bank Account " + bank);
    }
    
    
}