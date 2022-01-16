/*
1) Write a java program to demonstrate syntax, logical 2 runtime errors.

2) Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.

3) Write a program that allows you to give. If max retries exceed 5 print "errors".

4) Modify program in Q3 to throw a custom Exception if max retries are reached.

5) Wrap the program in Q3 inside a method which throws your custom Exception.
 */

import java.util.Scanner;

public class Practice_Set_6 {
    public static void main(String[] args) {
        // Problem 1
        // Syntax Error - int a = 7
        int age = 78;
        int year_born = 2000-78; // Logical error
//        System.out.println(6/0);

        // Problem 2
        try{
            int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }

        // Problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner Sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
