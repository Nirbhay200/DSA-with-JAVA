package Arrays;

import java.util.Arrays;

public class builtInMethod {
    public static void main(String[] args) {
        int[] arr = {10,20,34,56,37,89,67};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");

        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i]+ " ");

        }
    }
}
