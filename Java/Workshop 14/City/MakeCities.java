/**
 * @(#)MakeCities.java
 *
 *
 * @author 
 * @version 1.00 2017/1/11
 */

public class MakeCities {
        
    /**
     * Creates a new instance of <code>MakeCities</code>.
     */
    public MakeCities() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City c1 = new City("Liverpool");
        City c2 = new City("Leeds");
        City c3 = new City("London");
        
        c1.setPopulation(400000);
        c2.setPopulation(300000);
        c3.setPopulation(12000000);
        
    }
}
