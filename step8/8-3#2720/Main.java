import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #2720
 * 문제 이름 : 세탁소 사장 동혁
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(bf.readLine());

        for ( int i = 0 ; i < n; i++){
            int money = Integer.parseInt(bf.readLine());
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;

            quarter = money/25;
            dime = (money%25)/10;
            nickel = ((money%25)%10)/5;
            penny = ( ( (money%25) %10) %5)/1;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
        bf.close();
    }
}