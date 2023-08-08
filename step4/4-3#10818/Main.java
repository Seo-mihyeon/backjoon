import java.util.Scanner;
import java.util.Arrays;

/*
 * 문제 번호 : #10818
 * 문제 이름 : 최소, 최대
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for ( int i =0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[n-1]);
    }
}
