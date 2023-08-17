import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #11005
 * 문제 이름 : 진법 변환 2
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        System.out.println(Integer.toString( Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())).toUpperCase() );

        bf.close();
    }
}