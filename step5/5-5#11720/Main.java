import java.io.*;

/*
 * 문제 번호 : #11720
 * 문제 이름 : 숫자의 합
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] arr = new String[n];

        arr = bf.readLine().split("");
        int sum = 0;
        for ( int i=0; i< n; i++){
            sum +=  Integer.parseInt(arr[i]);
        }
        bf.close();

        System.out.println(sum);
        

    }
}