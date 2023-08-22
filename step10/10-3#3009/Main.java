import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #3009
 * 문제 이름 : 네 번째 점
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] x = new int[3];
        int[] y = new int[3];

        int x_dat = 0;
        int y_dat = 0;

        for ( int i = 0; i< 3; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        if ( x[0] == x[1]){
            x_dat = x[2];
        } else if ( x[0] == x[2]){
            x_dat = x[1];
        } else if ( x[1] == x[2]){
            x_dat = x[0];
        }

        if ( y[0] == y[1]){
            y_dat = y[2];
        } else if ( y[0] == y[2]){
            y_dat = y[1];
        } else if ( y[1] == y[2]){
            y_dat = y[0];
        }

        System.out.println(x_dat + " " + y_dat);
        

		bf.close();

	}
}