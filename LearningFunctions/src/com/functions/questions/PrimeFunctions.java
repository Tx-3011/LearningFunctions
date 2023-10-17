package com.functions.questions;
import java.util.Scanner;

public class PrimeFunctions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter input");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }

        int c =2;

        while (c * c <= n){
            if (n % c*c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;

    }



}

