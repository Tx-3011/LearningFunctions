package com.functions.questions;

import java.util.Scanner;

public class ArmstrongPrintFunction {
    public static void main(String[] args) {
        System.out.println("How many numbers should I check for?");
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
        for (int i = 1; i <= n; i++ ){
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n>0){
            int r = n%10;
            n = n/10;
            sum = sum + r*r*r;
        }
        return (sum == original);

    }
}
