package easy;

import java.util.Scanner;

public class A3496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        for(int i = 1; i <= 5; i ++){
            int y = in.nextInt();
            int q = y / 1000;
            int s = (y % 100) / 10;
            int g = y % 10;
            int b = (y / 100) % 10;
            if(q == s && g - 1 == b) res ++;
        }
        System.out.println(res);
    }
}
