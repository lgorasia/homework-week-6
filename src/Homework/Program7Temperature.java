package Homework;
// convert Fahrenheit to Celsius
import java.util.Scanner;

public class Program7Temperature {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the temperature in Fahrenheit:");
            float F = in.nextFloat();

            float C = (F-32) * 5/9;


            System.out.println(F +" degree Fahrenheit is equal to " + C + " degree in Celsius.");
        }
    }
