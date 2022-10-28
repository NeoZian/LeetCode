package Easy;

public class DivideTwoIntegers {
    public static void main(String[] args) {

        int dividend = 2147483648;
        int divisor = 3;

        long val =  divTwo(dividend,divisor);
        System.out.println(val);
//        int count=0;
//        boolean div1=false, div2=false;
//        if(dividend<0){
//             div1 = true;
//           // dividend = Math.abs(dividend);
//            dividend = -dividend;
//        }
//        if(divisor<0){
//            div2=true;
//            divisor = -divisor;
//           // divisor = Math.abs(divisor);
//        }
//
//        while (divisor>=dividend){
//
//            divisor = divisor-dividend;
//            count++;
//        }
//
//       // System.out.println(divisor);
//        if(div1 && div2){
//            System.out.println(count);
//        } else if (div1 || div2) {
//            System.out.println(-count);
//
//        }
//        else {
//            System.out.println(count);
//        }


    }

    static long divTwo(int dividend, int divisor){


        if(dividend > Integer.MAX_VALUE ){
            return Integer.MIN_VALUE;
        } else if (dividend<Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int count=0;
        boolean div1=false, div2=false;
        if(dividend<0){
            div1 = true;
            // dividend = Math.abs(dividend);
            dividend = -dividend;
        }
        if(divisor<0){
            div2=true;
            divisor = -divisor;
            // divisor = Math.abs(divisor);
        }

        while (dividend>=divisor){

            dividend = dividend-divisor;
            count++;
        }

        // System.out.println(divisor);
        if(div1 && div2){
            //System.out.println(count);
            return count;
        } else if (div1 || div2) {
            //System.out.println(-count);
            return -(count);

        }
        else {
            // System.out.println(count);
            return count;
        }



    }
}
