public class EvenDigits {

    public static void main(String[] args) {


        int [] arr = {234,555,6535,6535,44,11};
        System.out.println(FindNumbers(arr));


    }

    static int FindNumbers(int[] nums){
        int count = 0;
        for (int num:nums){

            if(even(num)){

                count++;
            }

        }
        return count;

    }

    static boolean even(int num){
        int NumberOfDigits = digits(num);
        return NumberOfDigits % 2 == 0;
    }

    static int digits(int num){
        int count = 0;
        while (num>0){

            num = num/10;
            count++;

        }
        return count;
    }


}
