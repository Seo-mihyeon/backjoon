import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #2869
 * 문제 이름 : 달팽이는 올라가고 싶다
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int v, a, b = 0;

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        int days = (v-a) / (a-b);
        if((v - a) % (a-b) != 0)
            days++;
        System.out.println(days+1);
        bf.close();
    }
}