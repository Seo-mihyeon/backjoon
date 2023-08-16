import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #2738
 * 문제 이름 : 행렬 덧셈
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int[][] arr2 = new int[n][m];

        for ( int i = 0; i< n; i++){
            st = new StringTokenizer(bf.readLine());
            for ( int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for ( int i = 0; i< n; i++){
            st = new StringTokenizer(bf.readLine());
            for ( int j = 0; j < m; j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for ( int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j]+arr2[i][j] + " ");
            }
            System.out.println();
        }
        bf.close();
    }
}