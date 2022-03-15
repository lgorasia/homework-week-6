package Homework;

public class Program4 {

    String name = "Radhe"; // variables
    String name1 = "Krishna";
    static String name3 = "Sita";
    static String name4 = "Ram";

    public static void main(String[] args) {
        Program4 obj1 = new Program4(); // object creation
        obj1.Lord1();
        Lord2();
    }

     public void Lord1() { // instant method
        System.out.println(name + name1);
        System.out.println(name3 + name4);
    }


    public static void Lord2() { // static method
        Program4 obj = new Program4();
        System.out.println(obj.name + obj.name1);
        System.out.println(name3 + name4);
    }
}
