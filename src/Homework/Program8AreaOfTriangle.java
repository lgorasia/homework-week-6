package Homework;
// calculate area of triangle
import java.util.Scanner;

public class Program8AreaOfTriangle {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value of base of Triangle in cm: ");
        double b = in.nextDouble();

        System.out.println("Enter value of height of the Triangle in cm:");
        double h = in.nextDouble();

        double a = (b*h/2);


        System.out.println("Area of Triangle is: " + a + "cm²" );
    }

}


