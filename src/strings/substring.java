package strings; // code number 7
public class substring {
    public static void main(String[] args) {
        String s = "abcde";
       // System.out.println(s.substring(2)); // prints 3 and aage wale indices

        //   System.out.println(s.substring(1,4));
        // print all substrings
        for(int i = 0; i < s.length(); i++) {
            for (int j =i+1; j <=s.length(); j++) {
                System.out.print(s.substring(i,j) + " ");
            }
            System.out.println();

        }
    }
}