package Homework;
import java.util.Scanner;
// average of 3 numbers
public class Program13Average {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double FirstNumber = in.nextDouble();

        System.out.println("Enter Second Number: ");
        double SecondNumber = in.nextDouble();

        System.out.println("Enter third Number: ");
        double ThirdNumber = in.nextDouble();

        double Average = (FirstNumber+SecondNumber+ThirdNumber)/3;

        System.out.println("Average is:" + Average);

    }
}