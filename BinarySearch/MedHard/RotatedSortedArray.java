package BinarySearch.MediumndHard;

public class RotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {1};
        int target = 0;
        int pivot = findPivot(arr);
       // System.out.println(pivot);

        int index;

        if(pivot == -1){

            //no pivot found that means the array is not rotated; so should do the normal binary search

            System.out.println(binSearch(arr,target,0, arr.length-1));

        }
        else {
            //pivot found and we have 2 ascending ordered array

            if (arr[pivot] == target) {
                System.out.println(pivot);
            } else if (target >= arr[0]) {

                index = binSearch(arr, target, 0, pivot - 1);
                System.out.println(index);

            } else {
                index = binSearch(arr, target, pivot + 1, arr.length - 1);
                System.out.println(index);
            }
            //  System.out.println(index);
        }
    }

    static int findPivot(int[] arr){

        int start =0;
        int end =  arr.length-1;

        while (start<=end){

            int mid = start+(end-start)/2;
            //4 cases
            if(mid<end && arr[mid]>arr[mid+1]){  //mid<end checks to ensure array indexing is not out of bound

                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){  //mid>start checks to ensure array indexing is not out of bound
                return mid-1;
            }

            if(arr[mid]<=arr[start]){

                end = mid-1;
            }else {
                start = mid+1;
            }

        }
        return -1;

    }

    static int binSearch(int[] arr,int target, int start, int end){


        while (start<=end){

            int mid = start +(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            //else {
             //   return mid;
         //   }

        }
        return -1;
    }
}
