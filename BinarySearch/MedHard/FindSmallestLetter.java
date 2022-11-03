package BinarySearch.MediumndHard;

public class FindSmallestLetter {

    public static void main(String[] args) {

        char[] arr = {'c','f','j'};

     //   System.out.println(arr[1]);
        char target = 'a';
        int index = binFinder(arr, target);
        System.out.println(arr[index]);
    }

    static int binFinder(char[] arr, char target){


        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start + (end - start)/2;

            if( target < arr[mid]){

                end = mid -1;
            } else  {

                start = mid+1;

            }

            /*
            this statement would have executed when the target value had been equal to the mid_value
            that means when the value was found in the array

            else {
                return mid;
            }

            */

        }
            //we need to return the start same as ceiling value
        return start % arr.length;  //is equivalent to start; in case it gets equal to the length then it returns 0; when start = end+1
                                                                                                    //that breaks the while loop;
    }                                //0 means the first index!!
}
