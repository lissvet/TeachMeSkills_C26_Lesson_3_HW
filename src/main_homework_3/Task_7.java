package main_homework_3;

import java.util.Scanner;

public class Task_7 {
    /** Class for solve task number seven**/

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = scan.nextInt();
        switch (month){
            case 1:
                System.out.println("It's January");
                break;
            case 2:
                System.out.println("It's February");
                break;
            case 3:
                System.out.println("It's March");
                break;
            case 4:
                System.out.println("It's April");
                break;
            case 5:
                System.out.println("It's May");
                break;
            case 6:
                System.out.println("It's June");
                break;
            case 7:
                System.out.println("It's July");
                break;
            case 8:
                System.out.println("It's August");
                break;
            case 9:
                System.out.println("It's September");
                break;
            case 10:
                System.out.println("It's October");
                break;
            case 11:
                System.out.println("It's November");
                break;
            case 12:
                System.out.println("It's December");
                break;
        }
    }

}
