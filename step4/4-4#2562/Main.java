import java.util.Scanner;
/*
 * 문제 번호 : #2562
 * 문제 이름 : 최댓값
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[9];
        int max = 0;
        int n =0;

        for ( int i =0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        for (int j = 0; j < arr.length; j++){
            if ( max < arr[j]){
                max = arr[j];
                n = j+1;
            }
        }

        System.out.println(max);
        System.out.println(n);


        
    }
}
