package strings; // 14

public class stringBuilderInJava {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        StringBuilder x = new StringBuilder(10);
        System.out.println(x.capacity());
    }
}
