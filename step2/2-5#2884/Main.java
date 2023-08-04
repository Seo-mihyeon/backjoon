import java.util.Scanner;

/*
 * 문제 번호 : #2884
 * 문제 이름 : 알람 시계
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();
        
        in.close();

        if ( m < 45){

            h--;
            m = 60 - (45 - m);
            if ( h < 0){
                h = 23;
            }
            System.out.println(h + " " + m);
        }else {
            System.out.println(h + " " + (m-45));
        }
     }
}
