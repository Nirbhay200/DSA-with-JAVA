package Pattern_Printing;
import java.util.Scanner;
public class numberTriangle {
    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {

                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    }

