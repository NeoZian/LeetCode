package Easy.Sortings.Cyclic;

import java.util.Arrays;

public class FistMissingPositive {
    public static void main(String[] args) {

        int[] arr = {-4,-2,9,4,1,1};
        int pos_gen = cyclic(arr);

        System.out.println(pos_gen);

    }

    static int cyclic(int[] arr){
        //sort o(n)
        int i=0;
        while (i< arr.length){

            int correct_index =  arr[i]-1;
            if(arr[i]>0 && arr[i]< arr.length && arr[i] != arr[correct_index] ){ //must remember the sequence of this check else you might get aan error
                //swap
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            }
            else{
                i++;
            }

        }

        System.out.println(Arrays.toString(arr));
        for ( i = 0; i < arr.length ; i++) {
            if(arr[i] != i+1){
                return i+1;   //for 0=> 0+1=1, that returns 1, else other numbers
            }
        }
        return i+1;
    }
}
