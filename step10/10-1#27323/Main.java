import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #27323
 * 문제 이름 : 직사각형
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());

		System.out.println(a*b);

		bf.close();

	}
}