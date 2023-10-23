
import java.util.Scanner;
public class USDtoINR {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        double b =  (a*82.06);

        System.out.println(a + " USD is around " + b + " INR");

    }
}
