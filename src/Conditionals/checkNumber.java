package Conditionals;

import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n%5==0) System.out.println("Divisible by 5 : ");
        else System.out.println("not divisible by 5 : ");
    }
}
