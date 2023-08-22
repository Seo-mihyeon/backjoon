import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #1085
 * 문제 이름 : 직사각형에서 탈출
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int x_min = 0;
        int y_min = 0;

        int x_dis = w-x;
        int y_dis = h-y;

        x_min = x < x_dis ? x : x_dis;
        y_min = y < y_dis ? y : y_dis;

        System.out.println(x_min < y_min? x_min : y_min);

        

		bf.close();

	}
}