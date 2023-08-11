import java.io.*;
/*
 * 문제 번호 : #10988
 * 문제 이름 : 팰린드롬인지 확인하기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String tmp = "";
        for ( int i = str.length()-1; i >=0; i--){
            tmp += str.charAt(i);
        }

        System.out.println(str.equals(tmp)? 1 : 0);
        bf.close();
    }
}