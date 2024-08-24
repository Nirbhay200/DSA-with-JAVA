package Arrays;

public class productOfArray {
        public static void main(String[] args) {
            int[] arr = {2,4,5,7,97,78,56,45,67,90,23,45};
            int prod = 1;
            for (int i = 1; i < arr.length; i++) {
                prod *= arr[i];
            }
            System.out.println(prod);
        }
    }

