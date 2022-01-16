/*
Java Practice Questions on Abstract Classes & Interfaces :
---------------------------------------------------------------

Create an abstract class pen with methods write () and refill () as abstract methods.

Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ().

Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods.

Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism.

Demonstrate polymorphism using monkey  class from Q3.

Create an interface TVremote and use it to inherit another interface smart TVremote.

Create a class TV which implements TVremote interface from Q6.
 */


abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class Practice_Set_4 {
    public static void main(String[] args) {
        // Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Q3
        Human harry = new Human();
        harry.sleep();

        // Q5
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

        BasicAnimal lovish = new Human();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();

    }
}