import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #14215
 * 문제 이름 : 세 막대
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int[] arr = {a , b, c};
        Arrays.sort(arr);
            
        if(arr[0]+arr[1] > arr[2]){
            System.out.println(a+b+c);
        }else{
            System.out.println((arr[0]+arr[1]) * 2 - 1);
    }

	}
}