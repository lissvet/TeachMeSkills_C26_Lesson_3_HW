package additional_homework_3;

import java.util.Objects;
import java.util.Scanner;

public class AdditionalTask_2 {
    /** class for solve additional task number two**/

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the geometric figure whose area you want to calculate (circle, triangle, rectangle): ");
        String figure = scan.nextLine();
        if (Objects.equals(figure, "circle")){
            System.out.println("Enter radius: ");
            double radius = scan.nextDouble();
            double circleArea = 3.14159 * radius * radius;
            System.out.println("Circle area: " + circleArea);
        } else if(Objects.equals(figure, "triangle")){
            System.out.println("Enter the base: ");
            double base = scan.nextDouble();
            System.out.println("Enter the height: ");
            double height = scan.nextDouble();
            double triangleArea = 0.5 * base * height;
            System.out.println("Triangle area: " + triangleArea);
        } else if(Objects.equals(figure, "rectangle")){
            System.out.println("Enter the first side: ");
            double firstSide = scan.nextDouble();
            System.out.println("Enter the second side: ");
            double secondSide = scan.nextDouble();
            double rectangleArea = firstSide * secondSide;
            System.out.println(rectangleArea);
        } else{
            System.out.println("Enter geometric figure correctly");
        }


    }

}
