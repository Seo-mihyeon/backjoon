import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #10101
 * 문제 이름 : 삼각형 외우기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while( true ){

            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int max = 0;
            int sum = 0;
            if ( a == 0 && b == 0 && c == 0) {
                break;
            }
            else {

                if ( (a > b) && (a > c)){
                    max = a;
                    sum = b +c;
                } else if ( (b > a) && (b > c)){
                    max = b;
                    sum = a+c;
                } else {
                    max = c;
                    sum = a+b;
                }
                if (max >= sum){
                    System.out.println("Invalid");
                }else {
                    if ( a == b && a == c && b == c ){
                        System.out.println("Equilateral");
                    } else if ( (a == b) || (a == c) || (b == c)){
                        System.out.println("Isosceles");
                    } else {
                        System.out.println("Scalene");
                    }
                }
                
            }

        }
        bf.close();

	}
}