import java.io.*;
import java.util.*;
/*
 * 문제 번호 : #9506
 * 문제 이름 : 약수들의 합
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(bf.readLine());
            int sum = 0;
            int cnt = 0;
            int cnt2 = 0;
            if ( n == -1) {
                break;
            } else {
                int[] arr = new int[n+1];
                for ( int i = 1; i <n; i++){
                    if ( n%i == 0){
                        arr[i] = i;
                        sum += i;
                        cnt++;
                    }
                }

                if ( sum == n){
                    System.out.print(n + " = ");
                    for ( int i =0; i<n; i++){
                        if ( arr[i] != 0){
                            ++cnt2;
                            if ( cnt == cnt2){
                                System.out.print(arr[i]);                            
                            } else {
                                System.out.print(arr[i] + " + ");                            
                            }
                            
                        }
                    }
                    System.out.println();
                } else {
                    System.out.println(n + " is NOT perfect.");
                }
            }
            

        }

    }
}