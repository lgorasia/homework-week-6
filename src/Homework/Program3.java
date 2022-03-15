package Homework;

public class Program3 {

    int a = 99; // variables
    static int b = 59;



    public static void main(String[] args) {  // main method
Program3 obj1 = new Program3(); // object creation
        obj1.Shyam(); // calling
        Ghanshyam();


    }



    public void Shyam(){ // instant method
        System.out.println(a);
        System.out.println(b);


    }


    public static void Ghanshyam(){ // static method
        Program3 obj = new Program3();
        System.out.println(obj.a);
        System.out.println(b);


    }
}
