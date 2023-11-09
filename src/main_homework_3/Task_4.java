package main_homework_3;

import java.util.Scanner;

public class Task_4 {
    /** Class for solve task number four**/

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a temperature outside:");
        int t = scan.nextInt();
        if(t > -5) {
            System.out.println("It's warm outside");
        } else if(-5 >= t && t > -20) {
            System.out.println("It's normal outside");
        } else {
            System.out.println("It's cold outside");
        }
    }

}
