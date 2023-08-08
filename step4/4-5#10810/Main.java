import java.util.Scanner;
/*
 * 문제 번호 : #10810
 * 문제 이름 : 공 넣기
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        int m = in.nextInt();

        for ( int i =0; i< m; i++){
            int f = in.nextInt();
            int e = in.nextInt();

            int ball = in.nextInt();

            for ( int j=f-1; j < e; j++){
                arr[j] = ball;
            }
        }

        in.close();

        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }

        
    }
}
