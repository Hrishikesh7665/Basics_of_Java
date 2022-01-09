/*
If the child class implements the same method present in the parent class again, it is know as method overriding.
Method overriding helps us to classify a behavior that is specific to the child class.
The subclass can override the method of the parent class only when the method is not declared as final.
 */

class Base_Class{
    public void print_Something(){
        System.out.println("Hi, I am From Base Class");
    }
}

class Derived_Class extends Base_Class{
    @Override       //<- It's Optional but its recommended
    public void print_Something(){
        System.out.println("Hi, I am From Base Class (Changed)");
    }
}

public class Java_27_Method_Overriding {
    public static void main(String[] args) {
        Derived_Class obj1 = new Derived_Class();
        obj1.print_Something();

        Base_Class obj2 = new Base_Class();
        obj2.print_Something();


    }
}
