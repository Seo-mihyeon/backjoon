import java.io.*;
import java.util.*;

/*
 * 문제 번호 : #2675
 * 문제 이름 : 문자열 반복
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));

        //입력갯수
        int n = Integer.parseInt(bf.readLine());

        for (int i=0; i < n; i++){
            
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

            int num = Integer.parseInt(st.nextToken());
            String word =st.nextToken();
            String[] arr = new String[word.length()-1];


            for ( int j = 0; j < word.length(); j++){
                arr = word.split("");

                for ( int k =0; k < num; k ++){
                    System.out.print(arr[j]);    
                }
                
            } 
            System.out.println("");           
        }       
        
        bf.close();
    }
}