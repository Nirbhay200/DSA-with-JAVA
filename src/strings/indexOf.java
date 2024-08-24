package strings; // code number 5

public class indexOf {
    public static void main(String[] args) {
        String s = "Nirbhay Kumar";
        System.out.println(s.indexOf('z'));
        System.out.println(s.indexOf('h'));
        System.out.println(s.lastIndexOf('a'));

        String a = "abc";
        String b = "abc";
        System.out.println(a.compareTo(b));
        String c = "Physics Wallah Skills";
        System.out.println(c.contains("Skill"));
        System.out.println(c.startsWith("Phy"));
        System.out.println(c.endsWith("lls"));
    }
}
