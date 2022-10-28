package Easy;

public class Palindrome {
    public static void main(String[] args) {

        int num = 112211,rem=0;
        int temp  = num;
        
        while(num>0){
            
            rem = (rem*10) + num%10;
            num/=10;
        }
        System.out.println(rem);
        if(rem==temp){
            System.out.println("true");
        }


        
    }
}
