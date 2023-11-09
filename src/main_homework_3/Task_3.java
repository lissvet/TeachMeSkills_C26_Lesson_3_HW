package main_homework_3;

import java.util.Scanner;

public class Task_3 {
    /** Class for solve task number three**/

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        if (a%2 == 0){
            System.out.println("You enter: " + a + " - it is an even number" );
        } else {
            System.out.println("You enter: " + a + " - it is an odd number" );
        }
    }

}
