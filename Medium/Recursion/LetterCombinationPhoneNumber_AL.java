package Medium.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationPhoneNumber_AL {
    static String p ="";
    public static void main(String[] args) {
        pad(p,"23");
        System.out.println(list);
    }

       static List<String> list = new ArrayList<>();
    static List<String> pad(String p, String up){
        if (up.isEmpty()){
            list.add(p);
           //System.out.println(p);
            return list;
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
        return list;
    }
}
