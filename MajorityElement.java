import java.util.Arrays;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4}, freq = 0, j = 0, num = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                int c = i - j;
                j = i;
                if (freq < c) {
                    freq = c;
                    num = arr[j - 1];
                }
            }
        }
        System.out.print("Freq : " + freq + "\nNum : " + num);
    }
}
/**
 * To find the max freq of an element just by a signle loop
 * Input : 1,4,5,3,3,3,3,3,4,4,4,4,4
 * Output : Freq : 6
 *          Num : 4
 * */