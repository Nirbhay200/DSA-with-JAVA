package loops;

import java.util.Scanner;

public class sumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }
}
