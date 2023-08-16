import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #10798
 * 문제 이름 : 세로읽기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        char[][] arr = new char[5][15];

        // 데이터 넣기
        for ( int i = 0; i <5; i++){
            String str = bf.readLine();
            for ( int j = 0; j <str.length(); j++){
                arr[i][j] = str.charAt(j);
            }
        }

        for ( int i = 0; i <15; i++){
            for ( int j = 0; j <5; j++){
                if(arr[j][i] == '\0') continue;
                System.out.print(arr[j][i]);
            }
        }

        bf.close();
    }
}