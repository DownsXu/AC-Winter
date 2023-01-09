package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class A4644 {
    static int n;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int s1 = 0, s2 = 0, a;
        for(int i = 1; i <= n;i ++){
            a = scan.nextInt();
            s1 += a;
            s2 += a * a;
        }
        System.out.println((s1*s1 - s2)/2);
    }
}
