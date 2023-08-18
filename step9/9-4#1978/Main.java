import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #1978
 * 문제 이름 : 소수 찾기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int cnt = 0;

        for ( int i =0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());

            for(int j=2; j<=num; j++){
                if(j==num) { 
                    cnt++;
                }
                if(num%j==0){
                    break;
                }
            }
        }

        System.out.println(cnt);


    }
}