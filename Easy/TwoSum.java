package Easy;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

      int[] arr = {2,5,5,11};

      int target = 100;

      int[] x = twosum(arr, target);
        System.out.println(Arrays.toString(x));



    }

    static int[] twosum(int[] arr, int target){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1;j < arr.length  ; j++) {

                if(arr[i]+arr[j]==target){

                    return new int[] {i,j};


                }
            }

        }

            return new int[] {-1};
    }
}
