/*
Static Keyword in Java:
-------------------------
The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes. The static keyword belongs to the class than an instance of the class. The static keyword is used for a constant variable or a method that is the same for every instance of a class.


The static can be used in:
---------------------------
Blocks
Variables
Methods
Classes


When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object.

We  can use Static member without creating an object.

 */

public class Java_56_Static_Keyword
{
    // static method
    static void For_example()
    {
        System.out.println("Hi, There");
    }

    public static void main(String[] args)
    {
        //Creating 'For_example' without creating an object
        For_example();
    }
}