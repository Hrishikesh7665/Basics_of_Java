/*
What does Abstract mean?
Abstract in English means existing in through or as an idea without concrete existence.

Abstract class :
--------------------
An abstract class cannot be instantiated.
Java requires us to extend it if we want to access it.
It can include abstract and non-abstract methods.
If a class includes abstract methods, then the class itself must be declared abstract

example :
public abstract class phone Model {
             abstract void switch off ();
              || more code
              }



Abstract class are used when we want to achieve security & abstraction(hide certain details & show only necessary details to the user)
example :

abstract class Phone{
  abstract void on();
}
class SmartPhone extends Phone{
void run(){
System.out.println("Turning on...");
}
public static void main(String args[]){
 Phone obj = new SmartPhone();
 obj.on();
}
}
*/

/*
Abstract method :
----------------------
A method that is declared without implementation is known as the abstract method.
An abstract method can only be used inside an abstract class.
The body of the abstract method is provided by the class that inherits the abstract class in which the abstract method is present.
In the above example, on() is the abstract method.

 */

abstract class Parent_Class{
    public Parent_Class(){
        System.out.println("Mai Parent_Class ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child_Class extends Parent_Class{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Second_Child_Class extends Parent_Class{
    public void th(){
        System.out.println("I am good");
    }
}
public class Java_29_Abstract_class {
    public static void main(String[] args) {
        //Parent_Class p = new Parent_Class(); -- error
        Child_Class c = new Child_Class();
        //Second_Child_Class c3 = new Second_Child_Class(); -- error
    }
}
