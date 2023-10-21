package com.functions.questions;
import java.util.Scanner;
public class ArmstrongCheckNonFunction {

    public static void main(String[] args) {
        System.out.println("Input the number please");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;
        int sum = 0;

        while (n > 0){
            int r = n % 10;
            n = n/10;
            sum = sum + r*r*r;
        }
        if (sum == temp){
            System.out.println("This is a armstrong number");
        }else System.out.println("This is not an armstrong number");
    }


}
