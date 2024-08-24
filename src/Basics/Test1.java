package Basics;

public class Test1 {
    int a;
    String name;
    public static void main(String[] args) {
        // declare the variable
        // create the object
        int num = 9; // primitive
        Test1 obj1 = new Test1(); // reference
        Test1 obj2 = new Test1();

        obj1.name = "Navin";


        System.out.println(obj1.a);
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);

    }


}
