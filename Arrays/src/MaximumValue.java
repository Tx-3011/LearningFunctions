

public class MaximumValue {
    public static void main(String[] args) {

        int[] arr = {12,54,55,321,85};

        System.out.println(max(arr));



    }

    static int max(int[] arr){

        int MaxVal = arr[0];

        for (int i = 1; i < arr.length ; i++) {

            if (MaxVal<arr[i]){

                MaxVal=arr[i];

            }

        }return MaxVal;


    }
}