import java.util.Scanner;
public class GreetingFunction {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);

    }

    private static String myGreet(String name) {

        return "It's Nice To See You Here, " + name;

    }
}
