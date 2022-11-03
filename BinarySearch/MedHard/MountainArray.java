package BinarySearch.MediumndHard;

public class MountainArray {
    static int midi;

    //that is a way
    public static void main(String[] args) {

        int[] arr = {3,9,5,4,1};

        int index = peakSearch(arr);

        System.out.println(index);



    }

    static int peakSearch(int[] arr){

        int start =0;
        int end  = arr.length-1;


        while (start<end){

             int mid = start + (end-start)/2;

            if (arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1]){

                start = mid +1;
            } else if (arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1]) {

                end = mid ;
                // You can't do mid-1 here because this will give you error. reason: while doing mid - 1, there might be no value there

            }
            else {
                midi = mid;
                return mid;
            }

        }
        return -1;



    }
}
