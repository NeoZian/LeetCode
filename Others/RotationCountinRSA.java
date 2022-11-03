package Others;

public class RotationCountinRSA {
    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 12};

        int index = findPivot(arr);

        if(index==-1){
            //no pivot found among the elements, that means the last element is the peak
            //that means the array is not rotated not too!!!!!!!
            System.out.println(0);

        }
        else {
            System.out.println(index+1);
        }

    }

    static int findPivot(int[] arr){

        int start = 0;
        int end  = arr.length-1;

        while (start<=end){

            int mid = start +(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[start]>arr[mid]){

                end = mid-1;
            }
            else {
                start = mid+1;


            }

        }

        return -1;


    }
}
