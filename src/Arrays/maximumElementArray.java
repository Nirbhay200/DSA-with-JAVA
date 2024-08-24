package Arrays;



public class maximumElementArray {
    public static void main(String[] args) {
        int[] arr = {10,8,43,12,15,16,56,8};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
          //  if (arr[i] > max) max = arr[i];
            mx = Math.max(mx, arr[i]);

        }
            System.out.println(mx);

        }


    }
