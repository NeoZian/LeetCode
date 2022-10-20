package LinearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] arr= {{1,23,2},{23,4,5},{4,5,4}};
        int richest  = findReachest(arr);

        System.out.println(richest);

    }

    static int findReachest(int[][] arr){

        int sum,richest=0;

        for (int i = 0; i < arr.length ; i++) {
            sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            if(sum>richest){
                richest=sum;
            }

        }
        return richest;

    }
}
