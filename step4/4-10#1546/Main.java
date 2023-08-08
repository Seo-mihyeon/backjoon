import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #1546
 * 문제 이름 : 평균
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new  BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        double[] arr = new double[n];
        double sum = 0;

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i< arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        // 정렬
        Arrays.sort(arr);
        
        for ( int j = 0; j < arr.length; j++){
            sum += ((arr[j]/arr[arr.length-1])*100);
        }

        System.out.println(sum/ arr.length);
    }
}