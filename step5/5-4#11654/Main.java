import java.io.*;

/*
 * 문제 번호 : #11654
 * 문제 이름 : 아스키 코드
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));

        char ch = bf.readLine().charAt(0);
        int num = (int)ch;

        bf.close();
        System.out.println(num);

    }
}