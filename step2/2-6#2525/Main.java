import java.util.Scanner;

/*
 * 문제 번호 : #2525
 * 문제 이름 : 오븐 시계
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 시간
        int h = in.nextInt();
        int m = in.nextInt();

        //경과 시간 
        int n = in.nextInt();

        in.close();
        System.out.println( ((m+n)/60+h)%24 + " " + (m+n)%60);
    }
}
