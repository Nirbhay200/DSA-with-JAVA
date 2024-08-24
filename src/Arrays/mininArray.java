package Arrays;

public class mininArray {
    public static void main(String[] args) {
            int[] arr = {10, 20, 45, 78, 98, 45, 90};
            int n = arr.length;
            int min = arr[0];
            for (int i = 0; i <= n; i--) {
                if (arr[i] > min) min = arr[i];

            }
            System.out.println(min);
        }
    }



