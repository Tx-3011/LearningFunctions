
import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        double b =  (a/82.06);

        System.out.println(a + " INR is around " + b + " USD");

    }
}
