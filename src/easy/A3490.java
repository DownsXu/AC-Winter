package easy;

import java.util.Scanner;

public class A3490 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;
        if(n <= 1) System.out.println(0);
        else {
            for(int i = n - 1;  i >= 1; i --){
                if(i*i % n < (double)n/2) res ++;
            }
            System.out.println(res);
        }
    }
}
