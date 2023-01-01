package easy;

import java.util.Scanner;

public class A1208 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] c1 = scanner.next().toCharArray();
        char[] c2 = scanner.next().toCharArray();
        int res = 0;
        for(int i = 0; i < c1.length-1; i ++){
            if(c1[i] != c2[i]){
                res ++;
                c1[i] = c2[i];
                if(c1[i+1] == '*'){
                    c1[i+1] = 'o';
                }else{
                    c1[i+1] = '*';
                }
            }
        }
        System.out.println(res);
    }
}
