import java.util.Scanner;
public class BinaryPalindromWithoutLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer(Integer.toBinaryString(sc.nextInt()));
        String s= sb.toString();
        if((sb.reverse().toString()).equals(s))
            System.out.println("Binary Palindrom");
        else System.out.println("Not binary palindrom");
    }
}
/**
 * To check whether the given number is binary palindrom or not without using loop
 * */