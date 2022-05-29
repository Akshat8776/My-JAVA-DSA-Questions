public class ChineseRemainder {
    public static void main(String args[])
    {
        int num[] = {5,7,27},rem[] = {3,2,7},k = num.length,j,x;
        loop1 : for(x=1;;x++)
            loop2:for (j=0; j<=k; j++)
                if (j == k)
                    break loop1;
                else if (x%num[j] != rem[j])
                    break loop2;
        System.out.println("Number is : " + x);
    }
}