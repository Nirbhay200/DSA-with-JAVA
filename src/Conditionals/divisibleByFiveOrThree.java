package Conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class divisibleByFiveOrThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n%5==0||n%3==0) System.out.println("Divisible");
        else System.out.println("not divisible");
    }
}
