package Pattern_Printing;

import java.util.Scanner;

public class starVerticalTriangleFlipped {
    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}

