package easy;

import java.util.Scanner;

public class A1208 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s1 = in.next().toCharArray();
        char[] s2 = in.next().toCharArray();

        int res = 0;
        for (int i = 0; i < s1.length-1; i ++){
            if (s1[i] != s2[i]){
                s1[i] = s2[i];
                if (s2[i+1] == 'o') s2[i+1] = '*';
                else s2[i+1] = 'o';
                res ++;
            }
        }
        System.out.println(res);
    }
}
