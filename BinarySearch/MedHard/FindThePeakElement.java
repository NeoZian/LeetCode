package BinarySearch.MediumndHard;

//same as mountain peak but gonna use a bit different logic ,KK:)
public class FindThePeakElement {
    public static void main(String[] args) {

        int[] arr = {1,2,3,1};

        int index = peakElement(arr);

        System.out.println(index);

    }

    static  int peakElement(int[] arr){

        int start =0;
        int end  =arr.length-1;

        while(start<end){

            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid+1]) {
                end = mid;  //rest of the array is not gonna be the ans
            }
            else {
                start = mid+1;
            }
        }

        return start;   //or end

    }
}
