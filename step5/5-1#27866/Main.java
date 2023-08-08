import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #27866
 * 문제 이름 : 문자와 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));

        String str = bf.readLine();
        int n = Integer.parseInt(bf.readLine());

        bf.close();
        System.out.println(str.charAt(n-1));
        
    }
}