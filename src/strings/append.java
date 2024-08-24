package strings; // 18

public class append {
    public static void main(String[] args) {
     StringBuilder s = new StringBuilder("Abc");
        System.out.println(s);
        s.append('*');
        System.out.println(s);
        s.append("xyz");
        System.out.println(s);
        char[] ch = {'r','a','g'};
        s.append(ch);
        System.out.println(s);
//        int[] arr = {1,2,3,4,5};
//        s.append(arr); // does not work
//        System.out.println(s);
        StringBuilder t = new StringBuilder("pqr");
        s.append(t);
        System.out.println(s);
       // s += "fgrrk"; // not possible
    }
}
