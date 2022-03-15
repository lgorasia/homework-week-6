package Homework;
// calculate area of circle
import java.util.Scanner;

public class Program6AreaOfCircle {



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter radius value: ");
            double r = in.nextDouble();
            double a = (3.14159265*r*r);


            System.out.println("Area of circle is: " + a );
        }
    }

