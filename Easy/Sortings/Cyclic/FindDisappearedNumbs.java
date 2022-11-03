package Easy.Sortings.Cyclic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbs {
    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};

        List<Integer> l2 = new ArrayList<>(10);

        l2 = findDisappearedNumbers(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(l2);


    }

    static List<Integer> findDisappearedNumbers(int[] arr){

        List<Integer> list = new ArrayList<>();
        int i =0;

        while (i<arr.length){

            int correct_index = arr[i]-1;
            if(arr[i] != arr[correct_index]){
                    //(arr[i]<= arr.length && arr[i] != i+1) , we would need this checker if there max num would be more than last_index
               // int correct_index = arr[i] -1;
                //swap
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;

            }
            else {
                i++;
            }


        }

        for ( i = 0; i < arr.length ; i++) {
            if(arr[i] != (i+1)){
                list.add(i+1);
            }
        }

        return list;
    }

}
