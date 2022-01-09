/*
private
default
protected
public

Access Modifier	        within class	within package	outside package by subclass only	outside package
public	                      Y	              Y	                    Y	                           Y
protected	                  Y	              Y	                    Y	                           N
Default	                      Y	              Y	                    N	                           N
private	                      Y	              N	                    N	                           N

Getters and Setters :
-------------------------
Getter ➼    Returns the value  [accessors]
setter ➼    Sets / updates the value  [mutators]

In the below code, we've created total 4 methods:
----------------------------------------------------
setName():  The argument passed to this method is assigned to the private variable name.
getName():  The method returns the value set by the setName() method.
setId():    The integer argument passed to this method is assigned to the private variable id.
getId():    This method returns the value set by the setId() method.
*/


class Employee3 {

    private int id;
    private  String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class Java_22_AccessModifiers_Getters_and_Setters {
    public static void main(String[] args) {
        Employee3 emp1 = new Employee3();

        emp1.setName("Shubham");
        System.out.println(emp1.getName());
        emp1.setId(1);
        System.out.println(emp1.getId());

    }
}