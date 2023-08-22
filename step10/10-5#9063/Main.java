import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #9063
 * 문제 이름 : 대지
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int[] arr_x = new int[n];
        int[] arr_y = new int[n];

        for ( int i = 0; i< n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            arr_x[i] = Integer.parseInt(st.nextToken());
            arr_y[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr_x);
        Arrays.sort(arr_y);
        
        System.out.println( ( arr_x[n-1] - arr_x[0] ) * ( arr_y[n-1] - arr_y[0] ));
		bf.close();

	}
}