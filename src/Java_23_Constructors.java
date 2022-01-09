/*
Constructors in Java :
Constructors are similar to methods, but they are used to initialize an object.

Constructors do not have any return type(not even void).

Every time we create an object by using the new() keyword, a constructor is called.

If we do not create a constructor by ourselves, then the default constructor(created by Java compiler) is called.


Rules for creating a Constructor :
------------------------------------------
The class name and constructor name should be the same.

It must have no explicit return type.

It can not be abstract, static, final, and synchronized.



Types of Constructors in Java :
--------------------------------------
There are two types of constructors in Java :

1. Default constructor
-------------------------
A constructor with 0 parameters is known as default constructor.

Syntax :
----------
<class_name>(){
//code to be executed on the execution of the constructor
}


2. Parameterized constructor
 ---------------------------------
A constructor with some specified number of parameters is known as a parameterized constructor.

Syntax :
----------
<class-name>(<data-type> param1, <data-type> param2,......){
//code to be executed on the invocation of the constructor
}
*/

/*
Example of Default constructor
--------------------------------
class CWH {
    CWH(){
        System.out.println("This is the default constructor of CWH class.");
    }

}
public class CWH_constructors {
    public static void main(String[] args) {
        CWH obj1 = new CWH();

    }
}
*/


/*
Example of Parameterized constructor
---------------------------------------
class CWH {
    CWH(String s, int b){

        System.out.println("This is the " +b+ "th video of "+ " "+ s);
    }

}
public class CWH_constructors {
    public static void main(String[] args) {
        CWH obj1 = new CWH("XyzNAme Java Playlist",42);

    }
}
*/

//Note:
//  Constructors can take parameters without being overloaded
//  There can be more than two overloaded constructors


/*
Example Of Constructor
-------------------------
// Create a Main class
public class Java_23_Constructors {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Java_23_Constructors() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
      Java_23_Constructors myObj = new Java_23_Constructors(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}
*/

/*
//Example Of Constructor With One Parameters
//-----------------------------------------------

public class Java_23_Constructors {
    int x;

    public Java_23_Constructors(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Java_23_Constructors myObj = new Java_23_Constructors(5);
        System.out.println(myObj.x);
    }
}
*/

/*
----------------------------------------------------------------------------------
My Practice:

//Java Constructor Normal (Without Overloading )
//class Test_Employee{
//    private int Emp_ID;
//    private String Emp_Name;
//
//    Test_Employee() {
//        Emp_ID = 0;
//        Emp_Name = "No Name";
//    }
//
//    public int getEmp_ID() {
//        return Emp_ID;
//    }
//    public String getEmp_Name() {
//        return Emp_Name;
//    }
//}

//Java Constructor With Arguments (Without Overloading )
//class Test_Employee{
//    private int Emp_ID;
//    private String Emp_Name;
//
//    Test_Employee(String N, int I) {
//        Emp_ID = I;
//        Emp_Name = N;
//    }
//
//    public int getEmp_ID() {
//        return Emp_ID;
//    }
//    public String getEmp_Name() {
//        return Emp_Name;
//    }
//}


//Java Constructor With Arguments And Overloading
class Test_Employee{
    private int Emp_ID;
    private String Emp_Name;

    Test_Employee() {
        Emp_ID = 0;
        Emp_Name = "Default - No Name";
    }

    Test_Employee(String N, int I) {
        Emp_ID = I;
        Emp_Name = N;
    }

    public int getEmp_ID() {
        return Emp_ID;
    }
    public String getEmp_Name() {
        return Emp_Name;
    }
}

public class Java_23_Constructors {

    public static void main(String[] args) {
	// write your code here
        Test_Employee emp0 = new Test_Employee();
        System.out.println(emp0.getEmp_ID());
        System.out.println(emp0.getEmp_Name());

        Test_Employee emp1 = new Test_Employee("Hrishikesh", 10);
        System.out.println(emp1.getEmp_ID());
        System.out.println(emp1.getEmp_Name());
    }
}
----------------------------------------------------------------------------------
 */


//Example Of Constructor With More than One Parameters
//--------------------------------------------------------

public class Java_23_Constructors {
    int modelYear;
    String modelName;

    public Java_23_Constructors(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Java_23_Constructors myCar = new Java_23_Constructors(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}