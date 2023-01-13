package easy;

import java.util.Scanner;

public class A868 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;
        for(int i = n; i >= 2; i --){
            if(check(i)) res ++;
        }
        System.out.println(res);
    }

    static boolean check(int n){
        for(int i = 2; i * i <= n;i ++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
