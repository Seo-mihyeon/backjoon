import java.io.*;
import java.util.*;

/*
 * 문제 번호 : #1152
 * 문제 이름 : 단어의 개수
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));

        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer( str, " ");

        System.out.println(st.countTokens());

        bf.close();
    }
}