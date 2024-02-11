package Medium.Recursion;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationPhoneNumber_AL_leet {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = medium("");
        System.out.println(list);
    }

    static List<String> medium(String up){


        String p ="";
        List<String> list = new ArrayList<>();

        if(up.isEmpty()){
            return list;
        }

        list = pad(p,up);
        return list;
    }

    static List<String> pad(String p, String up){
        if (up.isEmpty()){
            List<String> list = new ArrayList<>();  //local list
            list.add(p);
            //System.out.println(p);
            return list;
        }

        List<String> list = new ArrayList<>(); //global to this scope

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
            list.addAll(pad(p+ch, up.substring(1)));

        }
        return list;
    }


}
