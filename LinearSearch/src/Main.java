public class Main {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        int target = 11;
        int ansp = Linear(nums,target);
        System.out.println(ansp);
    }

    static int Linear(int []arr,int target){

        for (int index= 0; index < arr.length ; index++) {

            if (arr[index]==target){

                return target;

            }

        }

        return -1;

    }

}