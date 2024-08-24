package loops;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for(int i = 2; i<=n-1; i++){
            if(n%i==0){
                System.out.println("Composite number");
                x = 1;
                break;
            }
        }
        if(n==1) System.out.println("Neither prime or composite");
        if(n==0) System.out.println("Prime");
    }
}
