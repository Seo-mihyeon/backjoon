import java.util.Scanner;

/*
 * 문제 번호 : #14681
 * 문제 이름 : 사분면 고르기
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        if ( x > 0 && y > 0){
            System.out.println("1");
        } else if ( x < 0 && y > 0){
            System.out.println("2");
        } else if ( x < 0 && y < 0){
            System.out.println("3");
        } else if ( x > 0 && y < 0){
            System.out.println("4");
        }

        in.close();
    }
}
