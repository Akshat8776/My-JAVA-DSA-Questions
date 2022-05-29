public class gfginterview52_2 {
    public static String removePair(String s) {
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            char ch2=s.charAt(i+1);
                if(ch==ch2){
                    s=s.replaceAll(ch+""+ch2,"");
                    i=-1;
                }
            }
            if(s.equals(""))
                return "Empty String";
            return s;
        }

    public static void main(String[] args) {
        String s="aaabbabaa";
        System.out.println(removePair(s));
    }
}
/**
Task : remove two consequesnt letters

Input : "aaaaa"
Output : "a"

 Input : "aabababa"
 Output : "bababa"

 Input : "aaabbabaa" => "abbabaa" => "aabaa" => "baa" => "b"
 Output : "b"

 */
