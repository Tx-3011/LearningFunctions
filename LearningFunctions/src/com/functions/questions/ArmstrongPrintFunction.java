package com.functions.questions;

import java.util.Scanner;

public class ArmstrongPrintFunction {
    public static void main(String[] args) {
        System.out.println("How many numbers should I check for?");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        for (int i = 0; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int numberOfDigits = String.valueOf(n).length();
        int sum = 0;

        for (int i = n; i > 0; i /= 10) {
            int digit = i % 10;
            sum += Math.pow(digit, numberOfDigits);
        }

        return (sum == original);
    }
}
