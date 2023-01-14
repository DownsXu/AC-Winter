package easy;

import java.util.HashMap;
import java.util.Scanner;

public class A4653 {
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        HashMap<Integer, Integer> m = new HashMap<>();
    }

    static int countSum(int a){
        int res = 0;
        while(a != 0){
            res += a % 10;
            a /= 10;
        }
        return res;
    }
}
