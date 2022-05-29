public class aptitude1 {
    public static void main(String[] args) {
        String st=Integer.toBinaryString(12);
        int d=0,max=0,index=-1;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='0') {
                if (index != -1) {

                    d = i - index;
                    index = i;
                } else {index = i;d++;}
            }
            if(st.charAt(i)=='1')
                d++;
            if(d>max)
                max=d;
        }
        System.out.println(st);
        if(index==-1)
            max++;
        System.out.println(max);
    }
}

/**To find max number of consequest 1 excluding one zero
 1100=1110(3)
 110110=111110(5)
 11111=111111(6)
 1010101=1110101(3)
 */