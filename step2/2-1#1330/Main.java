import java.util.Scanner;

/*
 * 문제 번호 : #1330
 * 문제 이름 : 두 수 비교하기
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        if ( A > B){
          System.out.println(">");
        } else if ( A < B) {
          System.out.println("<");
        } else if ( A == B){
          System.out.println("==");
        }
        
        in.close();
    }
  }