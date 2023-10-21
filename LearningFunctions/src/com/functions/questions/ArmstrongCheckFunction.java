package com.functions.questions;
import java.util.Scanner;

public class ArmstrongCheckFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
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
