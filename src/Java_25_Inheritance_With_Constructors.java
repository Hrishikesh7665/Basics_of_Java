/*
When a derived class is extended from the base class, the constructor of the base class is executed first followed by the constructor of the derived class. For the following Inheritance hierarchy , the constructors are executed in the order:

C1- Parent
C2 - Child
C3 - Grandchild
Constructors during constructor overloading :
When there are multiple constructors in the parent class, the constructor without any parameters is called from the child class.
If we want to call the constructor with parameters from the parent class, we can use the super keyword.
super(a, b) calls the constructor from the parent class which takes 2 variables
*/

class Grand_Father_New{
    private int Age;
    private String Name;

    //Contractor--------------------------------
    Grand_Father_New(){
        System.out.println("Hi I am Your Grand Father");
    }
    Grand_Father_New(int x){
        System.out.printf("Hi I am Your Grand Father and my age is %d \n",x);
    }
    Grand_Father_New(int x, String n){
        System.out.printf("Hi I am Your Grand Father, my name is %s, and my age is %d \n",n,x);
    }
}

class Father_New extends Grand_Father_New{
    Father_New(){
        super(50,"Gobordhon");
        System.out.println("Hi I am Your Father");
    }
}

public class Java_25_Inheritance_With_Constructors {
    public static void main(String[] args) {
        Father_New son = new Father_New();
    }
}
