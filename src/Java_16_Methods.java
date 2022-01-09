/*
Sometimes our program grows in size, and we want to separate the logic of the main method from the other methods.
For instance, if we calculate the average of a number pair 5 times, we can use methods to avoid repeating the logic. [DRY – Don’t Repeat Yourself]
*/

/*
Void return type :
When we don’t want our method to return anything, we use void as the return type.

Static keyword :
The static keyword is used to associate a method of a given class with the class rather than the object.
You can call a static method without creating an instance of the class.
In Java, the main() method is static, so that JVM can call the main() method directly without allocating any extra memory for object creation.
All the objects share the static method in a class.
*/

//V.V.I
//Note: In the case of Arrays, the reference is passed. The same is the case for object passing to methods.


public class Java_16_Methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        x = 566;
        return z;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using Object creation
        //cwh_31_methods obj = new cwh_31_methods();
        //c = obj.logic(a, b);
        c = logic(a, b);
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
