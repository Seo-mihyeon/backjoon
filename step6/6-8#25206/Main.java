import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #25206
 * 문제 이름 : 너의 평점은
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[20];
        double sum = 0;
        double all = 0;
        
        for ( int i = 0; i < str.length; i++){
            str[i] = bf.readLine();
            StringTokenizer st = new StringTokenizer(str[i], " ");
            String sub = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String alpScore = st.nextToken();
            
            if ( alpScore.equals("A+")){
                sum += score * 4.5;
            } else if ( alpScore.equals("A0")){
                sum += score * 4.0;
            } else if ( alpScore.equals("B+")){
                sum += score * 3.5;
            } else if ( alpScore.equals("B0")){
                sum += score * 3.0;
            } else if ( alpScore.equals("C+")){
                sum += score * 2.5;
            } else if ( alpScore.equals("C0")){
                sum += score * 2.0;
            } else if ( alpScore.equals("D+")){
                sum += score * 1.5;
            } else if ( alpScore.equals("D0")){
                sum += score * 1.0;
            } else if ( alpScore.equals("F")){
                sum += score * 0.0;
            }

            if ( !alpScore.equals("P")){
                all += score;
            }
        } 
        double result = sum/all;
        System.out.printf("%.6f", result);
        
        bf.close();
    }
}