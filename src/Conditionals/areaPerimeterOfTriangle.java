package Conditionals;

import java.util.Scanner;

public class areaPerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Triangle : ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of the Triangle : ");
        int b = sc.nextInt();
        int a = l * b;
        int p = 2 * l + b;
        if (a > p) System.out.println("Area is greater than perimeter");
        else System.out.println("Area is not greater than perimeter");

    }
}