package Conditionals;

import java.util.Scanner;

public class youngestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of Ram: ");
        int r = sc.nextInt();
        System.out.println("Enter the age of Shyam: ");
        int s = sc.nextInt();
        System.out.println("Enter the age of Ajay: ");
        int a = sc.nextInt();
        if(r>s && r>a) System.out.println("Ram is youngest");
        else if(s>r && s>a) System.out.println("Shyam is youngest");
       else System.out.println("Ajay is youngest");
    }
}
