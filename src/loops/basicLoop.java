package loops;

import java.util.Scanner;

public class basicLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i<=10*n; i++){
            System.out.println(i);
        }
    }
}
