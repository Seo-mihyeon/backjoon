import java.util.Scanner;

/*
 * 문제 번호 : #10871
 * 문제 이름 : X보다 작은 수
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];
        int x = in.nextInt();

        for ( int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        for ( int i =0; i< n; i++){
            if ( x > arr[i]){
                System.out.print(arr[i]+" ");
            }
        }

        
    }
}
