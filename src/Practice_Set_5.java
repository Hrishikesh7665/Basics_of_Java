// Taking User Input Until The Input Is correct using Exception Handling


import java.util.Scanner;

public class Practice_Set_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int in;
        do {
            try {
                in = sc.nextInt();
                flag = false;
            }catch (Exception e){
                System.out.println("error");
            }
        }while (flag);

    }
}
