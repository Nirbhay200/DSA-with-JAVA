package Arrays;
import java.util.Arrays;
public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 29, 46, 54, 56, 43};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
      //  System.out.println();
      //  int[] nums = arr; // Shallow Copy
      //  nums[0] = 70;
      //  System.out.println(arr[0]);

        //deep copy
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 70;
        System.out.println(arr[0]);
        }

    }

