package Easy;

public class SearchIncertPosition {
    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        int target = 5;
        int index = search(nums,target);
        System.out.println(index);

    }
    static int search(int[] nums, int target){

        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(target==nums[mid]){
                return mid;
            }
            if(target<nums[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return start;

    }
}
