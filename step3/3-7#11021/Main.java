import java.util.Scanner;

/*
 * 문제 번호 : #11021
 * 문제 이름 : A+B - 7
 */

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for ( int i = 1; i<= n; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println("Case #"+i+": "+ (a+b));
        }

        in.close();

    
    }
}
