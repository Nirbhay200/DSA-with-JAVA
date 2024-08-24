package Arrays;

public class maxinArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 45, 78, 98, 45, 90};
        int n = arr.length;
        int mx = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > mx) mx = arr[i];

        }
        System.out.println(mx);
    }
}
