import java.util.*;
public class Strobogrammatic_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        String str="";
        loop1: for(int i=st.length()-1;i>=0;i--){
                    switch(st.charAt(i)){
                        case '0':str+=0;break;
                        case '1':str+=1;break;
                        case '6':str+=9;break;
                        case '8':str+=8;break;
                        case '9':str+=6;break;
                        default :break loop1;
                    }
        }
        if(st.equals(str))
            System.out.println("It is a strobogrammatic number");
        else
            System.out.println("It is not a strobogrammatic number");
    }
}
//Rotating a number by 180degrees and checking it whether it is equal to original number or not