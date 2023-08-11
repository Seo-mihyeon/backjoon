import java.io.*;
/*
 * 문제 번호 : #1157
 * 문제 이름 : 단어 공부
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = (bf.readLine()).toUpperCase();
        int[] check = new int[26];
        int max = 0;
        char answer = '?';
        for ( int i = 0 ; i < str.length(); i++){
            int num = str.charAt(i) - 'A';
            check[num]++;
        }

        for ( int j = 0; j< check.length; j++){
            if (check[j] > max){
                max = check[j];
                answer = (char)(j + 'A');
            } else if ( max == check[j]){
                answer = '?';
            }
        }

        System.out.println(answer);
        


        bf.close();
    }
}