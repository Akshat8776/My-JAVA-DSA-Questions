import java.util.*;
public class Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean arr[]=new boolean[n+1];
        for(int i=2;i<=n;i++)
            if(arr[i]==false) {
                System.out.println(i);
                for (int j = 2; j * i <= n; j++)
                    arr[i * j] = true;
            }
    }
}
//To find prime number upto n