package Easy.Sortings.Cyclic;

import java.util.Arrays;

public class FindTheDuplicate {
    public static void main(String[] args) {

        int[] arr = {1,3,2,4,5,4};
        //cyclic sort

        int i =0;
        while (i< arr.length){

            int correct_index = arr[i]-1;
            if(arr[i] != arr[correct_index]){
                //swap

                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;

            }
            else {
                i++;
            }

        }

        System.out.println(Arrays.toString(arr));
        int duplicate = 0;

        for ( i = 0; i < arr.length ; i++) {
            if(arr[i] != (i+1)){
                duplicate = arr[i];
            }
        }

        System.out.println(duplicate);

    }

}
