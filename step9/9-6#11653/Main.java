import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #11653
 * 문제 이름 : 소인수분해
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine());
 
		for (int i = 2; i <= Math.sqrt(N); i++) {
			while (N % i == 0) {
				sb.append(i).append('\n');
				N /= i;
			}
		}
		if (N != 1) {
			sb.append(N);
		}
		System.out.println(sb);
    }
}