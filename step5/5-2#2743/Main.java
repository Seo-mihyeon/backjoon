import java.io.*;

/*
 * 문제 번호 : #2743
 * 문제 이름 : 단어 길이 재기
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));

        String str = bf.readLine();

        bf.close();
        System.out.println(str.length());
        
    }
}