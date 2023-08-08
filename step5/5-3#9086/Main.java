import java.io.*;

/*
 * 문제 번호 : #9086
 * 문제 이름 : 문자열
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        for ( int i = 0; i< n; i++){
            String str = bf.readLine();

            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }   

        bf.close();
        
    }
}