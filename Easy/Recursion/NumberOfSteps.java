package Easy.Recursion;

public class NumberOfSteps {
    public static void main(String[] args) {

        int num =122;
        int steps = stepsCounter(num);
        System.out.println(steps);
    }
    static int count=0;
    static int stepsCounter(int n){

        if(n<=0){
            return n;
        }

        if(n%2==0){
            count++;
            stepsCounter(n/2);
        }
        else {
            count++;
            stepsCounter(--n);
        }

        return count;


    }
}
