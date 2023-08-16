import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #2566
 * 문제 이름 : 최댓값
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] arr = new int[9][9];
        int max = 0;
        int n = 0;
        int m = 0;

        // 데이터 넣기
        for ( int i = 0; i <9; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            for ( int j = 0; j <9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if ( arr[i][j] >= max){
                    max = arr[i][j];
                    n = i+1;
                    m = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.print(n + " " + m);
        
        bf.close();
    }
}