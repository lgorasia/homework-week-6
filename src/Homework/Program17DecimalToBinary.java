package Homework;
// change decimal to binary
import java.util.Scanner;

public class Program17DecimalToBinary {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        int decimal = scan.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number is " + binary);
    }
}