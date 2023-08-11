import java.io.*;
import java.util.*;

/*
 * 문제 번호 : #2908
 * 문제 이름 : 상수
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));

        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer( str, " ");
        String[] arr= new String[2];

        for ( int i = 0; i< arr.length; i++){
            arr[i] = new StringBuilder(st.nextToken()).reverse().toString();
        }

        System.out.println(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1]) ? arr[0] : arr[1]);
        
        bf.close();
    }
}