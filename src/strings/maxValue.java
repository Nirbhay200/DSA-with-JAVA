package strings;

public class maxValue {
    public static void main(String[] args) {
        String[] arr = {"10178","675858","598587","56372"};
        int mx = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            mx = Math.max(mx,n);

        }
        System.out.println(mx);
    }
}
