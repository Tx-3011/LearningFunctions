import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


       // 1D array

        int[] arr1D = new int[5];

        for (int i = 0; i < arr1D.length; i++) {
            arr1D[i] = in.nextInt();
        }

        for (int j : arr1D) {
            System.out.print(j + " ");
        }








    }

}