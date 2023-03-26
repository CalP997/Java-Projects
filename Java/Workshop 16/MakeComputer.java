/**
 * @(#)MakeComputer.java
 *
 *
 * @author 
 * @version 1.00 2017/2/8
 */

public class MakeComputer {
        
    public static void main(String[] args) {
        Computer c1 = new Computer();
        
        c1.manufacturer = "Toshiba";
        c1.RAM = 4;
        c1.noofprocessors; = 2;
        c1.OS = "Windows 7";
        
        c1.print();
        
        Computer c2 = new Computer();
        
        c2.manufacturer = "MAC";
        c2.RAM = 8;
        c2.noofprocessors = 4;
        c2.OS = "MAC OS 10";
        
        c2.print();
    }
}
