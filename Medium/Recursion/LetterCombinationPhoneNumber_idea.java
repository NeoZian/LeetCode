package Medium.Recursion;

public class LetterCombinationPhoneNumber_idea {
    public static void main(String[] args) {
        pad("", "12");
    }
    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' into 2 ;;by doing:
        //ex: string value of '2' in ascii =50, 0= 48 ,, so 50-48 ==2; so it makes char '2' into int 2  !!! #kitna_awesome
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);  //'a'+index ; ex: if(d,e,f in button 2 from index: 3,4,5) then d='a'+index
                                                    //'a'+3 ===>d
            pad(p+ch, up.substring(1));
        }


    }
}
