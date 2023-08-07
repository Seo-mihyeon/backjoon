import java.util.Scanner;

/*
 * 문제 번호 : #25314
 * 문제 이름 : 코딩은 체육과목 입니다
 */

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String str = "";
        int n = in.nextInt();

        in.close();

        int cnt = n/4;
        for (int i =0; i < cnt; i++){
            str += "long ";
        }

        System.out.println(str + "int");
    
    }
}
