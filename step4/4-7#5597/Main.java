import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #5597
 * 문제 이름 : 과제 안 내신 분..?
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[31];
        //온 사람은 출석 체크
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n] = 1;
        }
        for (int i = 1; i <= 30; i++) {
            if (arr[i] != 1) System.out.println(i);  //불리지 않은 사람 출력
        }
    }
}
