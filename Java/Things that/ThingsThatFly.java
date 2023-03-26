/**
 * @(#)ThingsThatFly.java
 *
 *
 * @author 
 * @version 1.00 2017/2/15
 */

public class ThingsThatFly {
    public static void main(String[] args) {
        Plane p1 = new Plane("Boeing 747");
        p1.print();
        System.out.println(p1.MethodOfFlight());
        
        Bat b1 = new Bat("Fruit Bat");
        b1.print();
        System.out.println(b1.MethodOfFlight());
        
        Bird c1 = new Bird("Crow");
        c1.print();
        System.out.println(c1.MethodOfFlight());
    }
}
