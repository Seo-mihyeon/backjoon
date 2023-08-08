import java.util.Scanner;

/*
 * 문제 번호 : #10807
 * 문제 이름 : 개수 세기
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int cnt = 0;
        int[] arr = new int[n];
        
        for(int i =0; i< n; i++){
            arr[i] = in.nextInt();
        }
        int match = in.nextInt();

        in.close();
        for ( int j = 0; j < n; j++){
            if ( match == arr[j]){
                cnt++;
            }
        }

        System.out.println(cnt);

        
    }
}
