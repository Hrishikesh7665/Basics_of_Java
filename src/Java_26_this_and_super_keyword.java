/*
this keyword in Java :
-------------------------

this is a way for us to reference an object of the class which is being created/referenced.
It is used to call the default constructor of the same class.
this keyword eliminates the confusion between the parameters and the class attributes with the same name.
 */

/*
Super keyword :
------------------

A reference variable used to refer immediate parent class object.
It can be used to refer immediate parent class instance variable.
It can be used to invoke the parent class method.
 */

class EkClass{
    int a;
    public int getA() {
        return a;
    }
    EkClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{ DoClass(int c){ super(c);
    System.out.println("I am a constructor"); }
}
public class Java_26_this_and_super_keyword {
    public static void main(String[] args) {
    EkClass e = new EkClass(65);
    DoClass d = new DoClass(5);
    System.out.println(e.getA()); }
}