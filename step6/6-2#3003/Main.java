import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #3003
 * 문제 이름 : 킹, 퀸, 룩, 비숍, 나이트, 폰
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int[] arr = new int[]{1, 1, 2, 2, 2, 8};
        int[] tmp = new int[6];

        StringTokenizer st = new StringTokenizer(str, " ");

        for ( int i = 0; i < arr.length; i++){
            tmp[i] = Integer.parseInt(st.nextToken());
            arr[i] = arr[i]- tmp[i];

            System.out.print(arr[i] + " ");
        }
        
        bf.close();
    }
}