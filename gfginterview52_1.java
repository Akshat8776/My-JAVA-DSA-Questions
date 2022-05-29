class gfginterview52_1
{
    static int xmod11(String x)
    {
        int j=-1;
        int sum=0;
        for(int i=0;i<x.length();i++){
            sum+=j*x.charAt(i);
            j*=-1;
        }
        if(sum>10)
            sum=sum%11;
        while(sum<0)
            sum+=11;

        return sum;

    }

    public static void main(String[] args) {
        String st="5000000000000000";
        System.out.println(xmod11(st));
    }
}
/**
 * Task: You have to create xmod11(String x) where
 * 1<=x<=100000
 *
 * Input: x = 1345
 * Output: 3

 */