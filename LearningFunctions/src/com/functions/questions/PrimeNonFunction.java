package com.functions.questions;
import java.util.Scanner;
public class PrimeNonFunction {
    public static void main(String[] args) {
        System.out.println("Please input your number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a <= 1){
            System.out.println("neither prime nor composite");
        }
         int c = 2;
        while (c*c <= a){

           if (a % c*c == 0) {
               System.out.println("composite");
               break;
           }
               c++;
           }
        if (c*c > a){

            System.out.println("Prime");

        }





}}
