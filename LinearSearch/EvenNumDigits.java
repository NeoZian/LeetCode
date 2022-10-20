package LinearSearch;

public class EvenNumDigits {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,789,45,45,45,4,5,6,90};
        int even_digits = findNumbers(nums);
        System.out.println(even_digits);


    }

    public static int findNumbers(int[] nums) {

        int count =0 ;
        for (int i = 0; i <nums.length ; i++) {

            if (isEven(nums[i])){
                count++;
            }
        }
        return count;

    }

    public static boolean isEven(int num){

        int count=0;

        while (num>0){

            count++;
            num = num/10;

        }
        if (count%2==0){
            return true;
        }
        else {
            return false;
        }

        //we could also do this
      //  return  count%2==0;

    }
}
