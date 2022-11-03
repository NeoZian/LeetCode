package BinarySearch.MediumndHard;

public class FindinMountainArray2 {

    static int len;

    public static void main(String[] args) {

        //you might get a runtime error due to exceeding calls of Mountain array in leetcode
        //to solve this we can reduce calling it to some extent

        int[] arr = {1,2,3,4,5,3,1};

        int target = 3;
        int index = peakSearch(arr, target, true);

        if( index == -1){

            index = peakSearch(arr, target, false);
        }

        System.out.println(index);


    }

    static int binSearch(int[] arr, int target, int peak, boolean asc ){

        if(asc){
            int start = 0;
            int end = peak;

            while (start<=end){

                int mid = start + (end - start)/2;

                int midi  = arr[mid];

                if(target<midi){

                    end = mid-1;
                } else if (target>midi) {

                    start = mid+1;

                }
                else {
                    return mid;
                }
            }
            return -1;

        }
        else {

            int start = peak+1;
            int end = len;

            while (start<=end){

                int mid = start + (end - start)/2;
                int midi  = arr[mid];
                if(target<midi){
                    start = mid+1;
                    // end = mid-1;
                } else if (target>midi) {

                    // start = mid+1;
                    end = mid-1;

                }
                else {
                    return mid;
                }
            }
            return -1;
        }


    }



    static int peakSearch(int[] arr, int target, boolean asc){
        len = arr.length-1;
        int start =0, end = len;

        while (start<end){

            int mid = start + (end-start)/2;

            //int midi  = arr[mid];

            if (arr[mid]>arr[mid+1]){
                end = mid;
            }
            else {
                //when arr[mid]<arr[mid+1]
                start = mid+1;

            }

        }

        //  return start;       //returns the index of peak element;
        return binSearch(arr, target, start, asc );



    }
}
