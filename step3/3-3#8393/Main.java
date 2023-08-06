import java.util.Scanner;

/*
 * 문제 번호 : #8393
 * 문제 이름 : 합
 */

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.close();

        int sum = 0;
        for ( int i =1 ; i <= n; i ++){
            sum += i;
        }
        System.out.println( sum );
    }
}
