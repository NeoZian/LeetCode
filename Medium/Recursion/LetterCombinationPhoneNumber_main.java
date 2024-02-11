package Medium.Recursion;

public class LetterCombinationPhoneNumber_main {
    public static void main(String[] args) {
        pad("","23");
    }


    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        //making string to digit one by one
        int digit = up.charAt(0) -'0';
        int from = ((digit-1)*3)-3;
        int to = (digit*3)-3;

        for (int i = from; i < to; i++) {
            if( i==17){
                to++;
            }
            if (from==18){
                from++;
                i=from;
                to++;
            }
            if (from==21){
                from++;
                i=from;
                to+=2;
            }
            char ch = (char) ('a'+i); // got to convert into char using typecasting
            pad(p+ch, up.substring(1));
        }
    }
}
