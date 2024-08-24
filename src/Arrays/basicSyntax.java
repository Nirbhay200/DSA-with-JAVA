package Arrays;

public class basicSyntax {
    public static void main(String[] args) {
        int x = 5;
        int[] arr = new int[5];
        // initialising individual elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
      // output of the array elements
        System.out.print(arr[0] + " ");
        // update
        arr[0] = 99;
        arr[0] += 10;
        System.out.print(arr[0] + " ");

    }
}
