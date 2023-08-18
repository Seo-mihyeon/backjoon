import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #2292
 * 문제 이름 : 벌집
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int count = 1;
        int sum = 1;

        while ( n > sum){
            sum += count * 6;
            count++;
        }

        System.out.println(count);

        bf.close();
    }
}