import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #3052
 * 문제 이름 : 나머지
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        int[] arr = new int[10];
        boolean tf;
        int cnt = 0 ;

        for ( int i =0; i < 10; i++){
            int n = Integer.parseInt(bf.readLine());
            arr[i] = n%42;
        }

        for ( int j = 0; j < arr.length; j++){
            tf = false;
            for ( int k = j+1; k < arr.length; k++){
                if ( arr[j] == arr[k]){
                    tf = true;
                    break;
                }
            }

            if ( tf == false){
                cnt++;
            }
        }
        System.out.println(cnt);
    
    }
}
