import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #10811
 * 문제 이름 : 바구니 뒤집기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 배열 크기 설정
        int n = Integer.parseInt(st.nextToken());
        // 바꿀 횟수 설정
        int m = Integer.parseInt(st.nextToken());
        

        int[] arr = new int[n];


        // 순서변경 초기값 설정
        for ( int i=0; i < arr.length; i++){
            arr[i] = i+1;
        }

        // 순서변경 횟수 만큼 반복문
        for(int j=0; j<m; j++) {
            st = new StringTokenizer(bf.readLine(), " ");
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;

            for(int k=x; k<=y; k++, y--) {
                int temp = arr[k];
                arr[k] = arr[y];
                arr[y] = temp;
            }
        }

        for(int z=0; z<arr.length; z++)
            System.out.print(arr[z] + " ");

        bf.close();

    }
}
