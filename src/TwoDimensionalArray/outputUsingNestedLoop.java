package TwoDimensionalArray;

import java.util.Scanner;

public class outputUsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];

        int m = arr.length; // no of rows / lines
        int n = arr[0].length; // no of cols
        System.out.println(m);
       // arr[0][0] = 9;

        // input of 2D Array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();

            }

        }

        // output of 2D Array
            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
    }
}
