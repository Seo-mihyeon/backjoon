import java.util.Scanner;

/*
 * 문제 번호 : #2438
 * 문제 이름 : 별 찍기 - 1
 */

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String str = "";
        for ( int i = 1; i<= n; i++){
            for ( int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for ( int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        in.close();

    
    }
}
