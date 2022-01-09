/*
The first letter of a class should always be capital.

Any real-world object           = Properties + Behavior
Object in OOPs                  = Attributes + Methods
*/


class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class Java_21_Own_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee hrishi = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for hrishi
        hrishi.id = 12;
        hrishi.salary = 34;
        hrishi.name = "XYZNAME";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Kejribal";

        // Printing the Attributes
        hrishi.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        // System.out.println(hrishi.id);
        // System.out.println(hrishi.name);
    }
}
