package Easy;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1,1,2};
        int count=0;


        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]>arr[i]){
                count++;
                arr[count] = arr[i+1];

            }
        }
        System.out.println(++count);
        System.out.println(Arrays.toString(arr));

    }
}
