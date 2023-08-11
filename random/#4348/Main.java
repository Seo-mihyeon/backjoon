import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #4348
 * 문제 이름 : 막대 정사각형
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        for ( int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            int sum = 0;

            for (int j = 0; j < num; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            System.out.println( sum%4==0 ? "yes" : "no");
        }
        bf.close();
    }
}