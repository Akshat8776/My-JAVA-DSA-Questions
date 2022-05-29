public class leaderArray {
    public static void main(String[] args) {
        int ar[]={25,10,17,4,5,2},n=ar.length-1,small=ar[n--];
        String st=small+"";
        for(;n>=0;n--)
            if(ar[n]>small){
                small=ar[n];
                st=small+" "+st;
            }
        System.out.println(st);
    }
}
/**
 * To print those number which is greater than all the numbers which are after that
 * Input : 25,10,17,4,5,2
 * Output : 25 17 5 2
 * */
