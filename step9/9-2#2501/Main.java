import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #2501
 * 문제 이름 : 약수 구하기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int rank = Integer.parseInt(st.nextToken());
        int result = 0;
        int count = 0;

        for ( int i = 1; i <=n; i++){
            if ( n%i == 0){
                count++;
            }

            if ( count == rank){
                result = i;
                break;
            }
        }

        System.out.println(result);

        bf.close();
    }
}