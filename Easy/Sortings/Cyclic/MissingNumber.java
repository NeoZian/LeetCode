package Easy.Sortings.Cyclic;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] nums = {9,6,4,2,3,5,7,0,1};




        int i=0;
        while(i< nums.length){

         /*   if(nums[i]>= nums.length){
                i++;
                continue;
            }
            or use the condition in che if checker
          */

            if(nums[i]< nums.length && nums[i] != i ){   //the program doesn't work, when there are duplicate values!!!gotta change logic
                 //follow the FindDisappeared numbers where there are multiple duplicates values present
                int correct_index = nums[i] ;

                //swap
                int temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        boolean found = false;

        for (int j = 0; j < nums.length; j++) {

            if(nums[j] != j){
                System.out.println(j);
                found = true;
            }

        }
        if(found==false){
            System.out.println(nums.length);
        }




    }
}
