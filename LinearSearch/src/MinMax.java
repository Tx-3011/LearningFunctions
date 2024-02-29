public class MinMax {
    public static void main(String[] args) {
        int [] nums = {832, 147, 593, 418, 759, 672, 305, 926, 481, 674, 239, 578, 184, 726, 390, 512, 847, 693, 251, 634, 719, 463, 581, 927, 374, 158, 843, 692, 315, 764, 529, 871, 416, 639, 287, 754, 129, 862, 437, 695, 318, 781, 564, 943, 276, 615, 489, 732, 197, 846, 523, 769, 384, 651, 219, 873, 498, 725, 361, 814, 539, 967, 412, 658, 293, 847, 536, 982, 174, 629, 385, 712, 249, 893, 476, 731, 628, 359, 814, 527, 963, 418, 682, 295, 748, 561, 947, 372, 619, 498, 735, 281, 864, 543, 978, 134, 679, 452, 796, 213, 857, 634, 981}
        ;

        System.out.println(min(nums));
        System.out.println(max(nums));
    }

    static int max(int[] arr){

        int temp = arr[0];
        for(int m : arr){

            if(m>temp){
                temp = m;
            }



        }

        return temp;

    }

    static int min(int[] arr){
        int temp2 = arr[0];
        for(int j : arr){

            if (j< temp2){

                temp2 = j;
            }

        }

        return temp2;

    }






}
