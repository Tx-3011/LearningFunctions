import java.util.Scanner;

public class fibonacci {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value of n --> ");
        int n = input.nextInt();

        int first = 0;
        int second = 1;
        int count = 0;

        while (count<n){

            System.out.print(first + " ");
            int next = first + second;
            first=second;
            second=next;

            count++;


        }


    }
}