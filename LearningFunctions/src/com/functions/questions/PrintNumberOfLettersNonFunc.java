package com.functions.questions;
import java.util.Scanner;

public class PrintNumberOfLettersNonFunc {
    public static void main(String[] args) {
        System.out.println("Type your word");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int length = word.length();
        System.out.println(length);

    }
}
