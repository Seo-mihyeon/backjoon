import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #5086
 * 문제 이름 : 배수와 약수
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String result="";

            if ( a==0 && b==0){
                break;
            } else {
                if ( a%b == 0) {
                    result = "multiple";
                } else if ( b%a == 0) {
                    result = "factor";
                } else {
                    result = "neither";
                }
            }
            System.out.println(result);
        }
        bf.close();

    }
}