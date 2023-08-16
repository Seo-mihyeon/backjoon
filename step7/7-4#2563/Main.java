import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #2563
 * 문제 이름 : 색종이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int arr[][] = new int[100][100];
        int n = Integer.parseInt(bf.readLine());
        int result = 0;
        for ( int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for ( int j = x; j< x+10; j++){
                for ( int k = y; k < y+10; k++){
                    arr[j][k] = 1;
                }
            }
        }

        for ( int i =0; i< arr.length; i++){
            for ( int j=0; j<arr[i].length; j++){
                if (arr[i][j] == 1){
                    result += arr[i][j];
                }
            }
        }

        System.out.println(result);

        bf.close();
    }
}