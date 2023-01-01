package easy;

import java.util.Scanner;

public class A3400 {
    static int n ,k;
    public static void main(String[] args) {

        int res = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();

        for(int i = 1; i <= n; i ++){
            res += cnt(i);
        }
        System.out.println(res);
    }

    static public int cnt(int x){
        int count = 0;
        while(x != 0){
            if(x % 10 == k) count++;
            x  /= 10;
        }
        return count;
    }
}
