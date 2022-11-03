package Easy.Sortings.Cyclic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicatesInArray {
    public static void main(String[] args) {

        int[] arr = {4,3,3,2,7,8,2,1};
        //cycle sort

        int i =0 ;
        while (i< arr.length){
            int correct_index = arr[i]-1;

            if(arr[i] != arr[correct_index]){
                //swap

                int temp =arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;

            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        List<Integer> list  = new ArrayList<>();

        for ( i = 0; i < arr.length ; i++) {
            if(arr[i] != i+1){
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }
}
