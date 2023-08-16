import java.io.*;
/*
 * 문제 번호 : #1316
 * 문제 이름 : 그룹 단어 체커
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 단어 갯수
        int n = Integer.parseInt(bf.readLine());
        int cnt = 0;
        for ( int i = 0; i < n; i++){
            // 각각 단어 받아오기
            String str = bf.readLine();
            // 알파벳갯수 만큼 배열 가지고있기
            boolean check[] = new boolean[26];
            boolean tmp = true;

            for ( int j = 0; j < str.length(); j++){
                int index = str.charAt(j) - 'a'; //알파벳 자리 확인하기
                if ( check[index]) {
                    if ( str.charAt(j) != str.charAt(j-1)){
                        // 이전 문자와 다르다
                        tmp = false;
                        break;
                    } 
                }else {
                        check[index] = true;
                }
            }
            if(tmp) cnt++;
        }
        System.out.println(cnt);
        bf.close();
    }
}