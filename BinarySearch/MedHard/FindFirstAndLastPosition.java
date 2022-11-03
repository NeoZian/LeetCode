package BinarySearch.MediumndHard;

import java.util.Arrays;

//Medium

public class FindFirstAndLastPosition {
    public static void main(String[] args) {

        int[] arr = {2,3,4,4,4,6,7,9,9};

        int target = 4;

        int[] ans = new int[2];

        int index_start = findIndex(arr, target, true);
        int index_end = findIndex(arr, target, false);

        ans[0] = index_start;
        ans[1] = index_end;

        System.out.println(Arrays.toString(ans));

    }

    static int findIndex(int[] arr, int target, boolean findStart){

        int start = 0;
        int end  = arr.length-1;
        int ans = -1;     //let, the default ans is -1

        while (start<=end){

            int mid  = start + (end-start)/2;

            if(target<arr[mid]){

                end = mid-1;
            }
            else if(target>arr[mid]) {
                start = mid +1;
            }
            else {
                    //when equals
                // but there could be more potential ans to the left side
                ans = mid;
                if(findStart){

                    end = mid -1;
                }
                else {
                    start = mid+1;
                }
            }
        }

        return ans;
    }



}
