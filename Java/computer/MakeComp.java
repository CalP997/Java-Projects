/**
 * @(#)MakeComp.java
 *
 *
 * @author 
 * @version 1.00 2017/2/8
 */

public class MakeComp {
        
    
    public static void main(String[] args) {
        Comp c1 = new Comp();
        c1.manufacturer = "Toshiba";
        c1.RAM = 4;
        c1.noofprocessors = 2;
        c1.OS = "WINDOWS 7";
        
        c1.print();
        
         Comp c2 = new Comp();
        c2.manufacturer = "MAC";
        c2.RAM = 8;
        c2.noofprocessors = 4;
        c2.OS = "MAC OS";
        
        c2.print();
    }
}
