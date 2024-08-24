package Arrays;

import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,97,78,56,45,67,90,23,45};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}