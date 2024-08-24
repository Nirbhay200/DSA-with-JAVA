package Conditionals;

import java.util.Scanner;

public class profitAndLoss {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter cost price");
            int cp = sc.nextInt();
            System.out.println("Enter selling price");
            int sp = sc.nextInt();
            if(sp>cp) System.out.println("Profit : ");
            if(cp>sp) System.out.println("Loss : ");
            if(cp==sp) System.out.println("No profit No loss");
        }
    }

