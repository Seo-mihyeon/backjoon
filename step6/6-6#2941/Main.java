import java.io.*;
/*
 * 문제 번호 : #2941
 * 문제 이름 : 크로아티아 알파벳
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String str = bf.readLine();
        int cnt = 0;

        for ( int i = 0; i < str.length(); i++){

            if ( str.charAt(i) == 'c' && str.length()-1 > i){
                if (str.charAt(i+1) == '=' || str.charAt(i+1) == '-'){
                    i++;
                }
            }

            if ( str.charAt(i) == 'd' && str.length()-1 > i){
                if ( str.charAt(i+1) == 'z' && str.length()-2 > i){
                    if(str.charAt(i+2) == '='){
                        i+=2;
                    }
                } else if ( str.charAt(i+1) == '-'){
                    i++;
                }
            }

            if ( str.charAt(i) == 'l'  && str.length()-1 > i){
                if ( str.charAt(i+1) == 'j'){
                    i++;
                }
            }

            if ( str.charAt(i) == 'n' && str.length()-1 > i){
                if ( str.charAt(i+1) == 'j'){
                    i++;
                }
            }

            if ( str.charAt(i) == 's' && str.length()-1 > i){
                if ( str.charAt(i+1) == '='){
                    i++;
                }
            }

            if ( str.charAt(i) == 'z'&& str.length()-1 > i){
                if ( str.charAt(i+1) == '=' ){
                    i++;
                }
            }
            cnt ++;
        }

        System.out.println(cnt);
        bf.close();
    }
}