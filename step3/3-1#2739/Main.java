import java.util.Scanner;

/*
 * 문제 번호 : #2739
 * 문제 이름 : 구구단
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.close();

        for ( int i=1; i< 10; i++){
            System.out.println( n +" * " + i + " = " + n*i);
        }
    }
}
