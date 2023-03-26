/**
 * @(#)MakeEmployee.java
 *
 *
 * @author 
 * @version 1.00 2017/1/25
 */

public class MakeEmployee {
        //test employee class
    public static void main(String[] args) {
        Employee e1 = new Employee("Jack", "Black", "Sales clerk", 300);    
        e1.print();
        Employee e2= new Employee("Connor", "McGregor", "Analyst", 576);
        e2.print();
}
}