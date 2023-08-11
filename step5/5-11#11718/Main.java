import java.io.*;
import java.util.*;

/*
 * 문제 번호 : #11718
 * 문제 이름 : 그대로 출력하기
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));

        String str = "";
        while((str = bf.readLine()) != null){
            System.out.println(str);
        }

        bf.close();
    }
}