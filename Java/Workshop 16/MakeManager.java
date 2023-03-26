/**
 * @(#)MakeManager.java
 *
 *
 * @author 
 * @version 1.00 2017/1/25
 */

public class MakeManager {
 
    public static void main(String[] args) {
        Manager m1 = new Manager("Jack", "White", "Jnr Manager", 900, "Admin");
        m1.print();
        Manager m2 = new Manager("Connor", "McGregor", "Snr Manager", 897, "Help desk");
        m2.print();
    }
}
