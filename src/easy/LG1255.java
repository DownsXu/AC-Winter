package easy;

import java.util.Scanner;

public class LG1255 {
    static int n = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.print(f(n));
    }

    static int f (int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return f(n-2) + f(n-1);
    }
}
