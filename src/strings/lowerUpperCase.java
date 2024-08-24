package strings; // code number 6

public class lowerUpperCase {
    public static void main(String[] args) {
        String s = "Nirbhay Kumar Is 19 Years Old";
        //System.out.println(s.toLowerCase());
       // s.toLowercase(); -> nothing will happen
         s = s.toLowerCase();
        System.out.println(s);
        System.out.println(s.toUpperCase());

        String a = "abc";
        String b = "xyz";
        System.out.println(a+b);
        System.out.println(a.concat(b));


        String x = ""; // Empty String
        System.out.println(x.length());

    }
}
