import java.util.Scanner;

/*
 * 문제 번호 : #9498
 * 문제 이름 : 두 수 비교하기
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();

        if ( A >= 90 && A <= 100){
            System.out.println("A");
        } else if ( A >=80 && A < 90){
            System.out.println("B");
        } else if ( A >=70 && A < 80){
            System.out.println("C");
        } else if ( A >= 60 && A <70){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
