import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #10101
 * 문제 이름 : 삼각형 외우기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int[] arr= new int[3];
        for ( int i = 0; i< 3; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
        }

        if ( sum == 180){
            
            if ( arr[0] == 60 && arr[1] == 60 && arr[2] == 60){
                System.out.println("Equilateral");
            } else if ( arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]){
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }

        } else {
            System.out.println("Error");
        }

        bf.close();

	}
}