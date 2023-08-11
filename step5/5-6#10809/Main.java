import java.io.*;

/*
 * 문제 번호 : #10809
 * 문제 이름 : 알파벳 찾기
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));

        String str = bf.readLine();
        int[] arr= new int[26];

        for ( int i =0; i < arr.length; i++){
            arr[i] = -1;
        }

        for ( int j = 0; j < str.length(); j++){
            char ch = str.charAt(j);
            if ( arr[ch - 'a' ]==  -1){
                arr[ch - 'a'] = j;
            }
        }

        for ( int k=0; k < arr.length; k++){
            System.out.print(arr[k]+ " ");
        }

        bf.close();
    }
}