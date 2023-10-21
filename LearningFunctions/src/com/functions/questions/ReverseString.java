package com.functions.questions;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter your word");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int i = word.length();

        while (i>0){
            char letter = word.charAt(i-1);
            System.out.print(letter);
            i--;
        }

    }
}
