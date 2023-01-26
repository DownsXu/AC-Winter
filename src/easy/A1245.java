package easy;

import java.util.Scanner;

public class A1245 {
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i ++){
            if(isR(i)) res += i;
        }
        System.out.println(res);
    }

    static boolean isR(int i){
        int k = -1;
        while(i != 0){
            k = i % 10;
            i /= 10;
            if (k == 2 || k == 0 || k == 1 || k == 9) return true;
        }
        return false;
    }
}
