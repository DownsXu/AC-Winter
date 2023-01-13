package easy;

import java.util.Scanner;

public class A3491 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long res = 1;
        for(int i = 2; i * i <= n; i ++){
            if(n % i == 0){
                int s = 0;
                while (n % i == 0){
                    n /= i;
                    s ++;
                }
                if(s % 2 != 0) res *= i;
            }
        }
        if(n != 1) res *= n;
        System.out.println(res);
    }
}
