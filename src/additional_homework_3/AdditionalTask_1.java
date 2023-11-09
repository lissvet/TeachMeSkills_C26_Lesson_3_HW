package additional_homework_3;

import java.util.Scanner;

public class AdditionalTask_1 {
    /** class for solve additional task number one**/

    public static void main (String[] args){
        System.out.println("Enter limit for Fibonacci number:");
        Scanner scan = new Scanner(System.in);
        int maxNumber = scan.nextInt();
        int f1 = 1;
        int f2 = 1;
        int fn;
        int counter = 1;
        System.out.println(0);
        System.out.println(f1);
        System.out.println(f2);
        while (counter < 100){
            counter++;
            fn = f1+f2;
            if (fn > maxNumber){
                return;
            }
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }
    }

}
