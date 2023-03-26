/**
 * @(#)MakeComputer.java
 *
 *
 * @author 
 * @version 1.00 2017/2/8
 */

public class MakeComputer {
        
    /**
     * Creates a new instance of <code>MakeComputer</code>.
     */
    public MakeComputer() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.setManufacturer("Toshiba");
        c1.print();
        c1 = new Laptop();
        c1.print();
        
         Computer c2 = new Computer();
        c2.setManufacturer("MAC");
        c2.setRAM(8);
        c2.setNoofprocessors(4);
       c2.setOS("MAC OS");
        
       c2.print();
        
        Computer c3 = new Computer();
        c3.setManufacturer("Samsung");
        c3.setRAM(32);
        c3.setNoofprocessors(4);
        c3.setOS("Windows 10");
        
        c3.print();
    }
}
