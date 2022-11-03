package Easy.Sortings.Cyclic;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {3,2,2};  //2 is twice in the place of 3
        int[] arr2=findErrorNums(arr);
        System.out.println(Arrays.toString(arr2));


//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] != i+1){
//              //  arr2[i] =
//                System.out.println(arr[i]+" "+(i+1));
//
//            }
//        }

        //findErrorNums(arr);
    }


    static int[] findErrorNums(int[] arr){
//        System.out.println(Arrays.toString(arr));
//
//        //cycle sort
        int i=0;
        while (i< arr.length){
            int correct_index = arr[i] -1;

            if(arr[i] != arr[correct_index] ){
            //swap
                int temp = arr[i];
                arr[i] =  arr[correct_index];
                arr[correct_index] = temp;

            }
            else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
        for (i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                //  arr2[i] =
              //  System.out.println(arr[i]+" "+(i+1));
                return new int[]{arr[i],(i+1)};

            }
        }
      return new int[]{-1,-1};
    }
}
