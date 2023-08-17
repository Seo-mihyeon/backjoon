import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #2903
 * 문제 이름 : 중앙 이동 알고리즘
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        System.out.println((int)Math.pow(Math.pow(2, n) +1, 2));

        bf.close();
    }
}