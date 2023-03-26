/**
 * @(#)City.java
 *1.make attributes private
 *2.add get/set methods for each attribute
 *3.make other methods and constructors public
 * @version 1.00 2017/1/11
 */


public class City {
	//attributes
	private String name;
	private int population;
	
	//constructors

    public City() {
    	System.out.println("Used default constructor");
    	this.name = "";
    	this.population = 0;
    }
    public City(String name){
    	System.out.println("used constructor 1");
    	this.name = name;
    	this.population = 0;
    }
    	public City(String name , int population){
    		System.out.println("used constructor 2");
    		this.name = name;
    		this.population = population;
    	}
    	public City(int population){
    		System.out.println("used constructor 3");
    		this.name = "";
    		this.population = population;
    	}
    	//get/set methods
    	public void setName(String name){
    		this.name = name;
    	}
    	public String getName(){
    		return this.name;
    	}
    	public void setPopulation(int population){
    		if (population < 0 ){
    			System.out.println("Error invalid");
    		this.population = 0;	
    		}else{
    			this.population = population;
    		}
    		}
    	public int getPopulation(){
    		return this.population;
    	}
    	//other methods
    	public void print(){
    		System.out.println("name: " + name);
    		System.out.println("population: " + population);
    	}
    
    
    
    
}