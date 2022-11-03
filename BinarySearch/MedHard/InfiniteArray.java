package BinarySearch.MediumndHard;

//outside leetcode question
public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr={2,3,4,5,7,8,12,23,34,45,56,67,68,69,78,88,89,90,99};

        //let say, we dont know the size of this array
        //so we can't use the arr.length to apply binary search;

        int target = 5;

        int index = findStartEnd(arr,target);
        System.out.println("found at:"+index);

    }

    static int findStartEnd(int[] arr, int target){

        //this is our first chunk of code where the block size is:2
        int start = 0;
        int end = 1;
        //so the second chunk should be 4  then 3rd block should be 8 and so on and on

        while(target>arr[end]) {  //when the target is not found inside the block, cz arr[end] will be higher then!

            int newStart = end + 1;

            end = newStart * 2 + 1;   //this might throw array out of bounds error but we are talking about an infinite array so you should consider about the solution

            //   end = end + (end -start +1)*2;

            start = newStart;

        }



        return binSearch(arr, target, start, end);

    }


    static int binSearch(int[] arr, int target, int start, int end){

        while (start<=end){

            int mid = start + (end - start)/2;

            if (target<arr[mid]){

                end = mid-1;
            } else if (target>arr[mid]) {

                start = mid +1;

            }
            else {

                return mid;
            }

        }
        return -1;

    }
}
