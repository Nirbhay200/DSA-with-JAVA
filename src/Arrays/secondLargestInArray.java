package Arrays;

public class secondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {10,8,43,12,15,16,56,8};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, arr[i]);
        }
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=mx)
                smx = Math.max(smx, arr[i]);

        }
        System.out.println(mx);
        System.out.println(smx);

    }
    }
