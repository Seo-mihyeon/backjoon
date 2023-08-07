import java.util.Scanner;

/*
 * 문제 번호 : #10951
 * 문제 이름 : A+B - 4
 */

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        while(in.hasNextInt()){
            int a = in.nextInt();
            int b = in.nextInt();
            
            System.out.println(a+b);
        }
        in.close();
    
    }
}
