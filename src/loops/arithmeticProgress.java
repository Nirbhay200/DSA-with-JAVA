package loops;

import java.util.Scanner;

public class arithmeticProgress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for(int i=4; i<=3*n-1; i+=3){
            System.out.println(i);
        }
    }
}
