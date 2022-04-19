package Baithuchanh;

import Baithuchanh.Person;
import Baithuchanh.Customer;
import Baithuchanh.VIPCustomer;
import Baithuchanh.Employee;
import Baithuchanh.FullTimeEmployee;
import Baithuchanh. PartTimeEmployee;
import Baithuchanh.Student;
import Baithuchanh.OfflineStudent;
import Baithuchanh.OnlineStudent;
public class App{
    public static void main(String[] args){
        Person ps = new Person("Person", 18);
        Student std = new Student("Student", 18, 4.0);
        OfflineStudent off = new OfflineStudent("Off", 18, "Co");
        OnlineStudent onl = new OnlineStudent("Onl", 18, "Co");
        Customer ct = new Customer("Customer", 18, 50000);
        VIPCustomer vct = new VIPCustomer("VIP", 18, 5000, 3.1);
        Employee e = new Employee("Employee", 18, 1);
        PartTimeEmployee pt = new PartTimeEmployee("Part time", 10, 50000);
        FullTimeEmployee ft = new FullTimeEmployee("Full time", 10000000, 5);
        ps.display();
        std.display();
    }
}