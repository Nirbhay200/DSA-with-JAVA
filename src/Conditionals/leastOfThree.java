package Conditionals;

import java.util.Scanner;

public class leastOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        int c = sc.nextInt();

        int least = a;

        if (b < least) {
            least = b;
        }
        if (c < least) {
            least = c;
        }

        // Print the least integer
        System.out.println("The least of the three integers is: " + least);


    }
}




