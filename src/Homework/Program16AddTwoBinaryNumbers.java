package Homework;
// add tow binary numbers
import java.util.Scanner;

public class Program16AddTwoBinaryNumbers {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st Binary number: ");
        int num1 = scan.nextInt(2);
        System.out.print("Enter 2nd Binary number: ");
        int num2 = scan.nextInt(2);

        System.out.println("Sum of two Binary numbers: " + Integer.toBinaryString(num1 + num2));

    }
}