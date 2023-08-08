import java.util.Scanner;
/*
 * 문제 번호 : #10813
 * 문제 이름 : 공 바꾸기
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // n개의 바구니
        int n = in.nextInt();
        int[] arr = new int[n];

        // m번 교환
        int m = in.nextInt();

        // 처음에 번호와 같은 번호가 적힌 공이 들어가있음
        for ( int i=0; i < n; i++){
            arr[i] = i+1;
        }

        for ( int j=0; j < m; j++){
            int x = in.nextInt();
            int y = in.nextInt();

            int tmp = arr[x-1];

            arr[x-1] = arr[y-1];
            arr[y-1] = tmp;
        }


        for ( int k=0; k<n; k++){
            System.out.print(arr[k] + " ");
        }

        
    }
}
