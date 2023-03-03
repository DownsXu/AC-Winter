package easy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-02-18 19:03
 * @Description: TODO
 */

public class A4861 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t -- > 0){
            ArrayList<Integer> list = new ArrayList<>();
            int x = in.nextInt();
            int idx = 1;
            int res = 1;
            if (x <= 10){
                System.out.println(res);
                System.out.println(x);
                break;
            }
            while (x != 0){
                list.add((x % 10) * idx);
                res ++;
                idx *= 10;
                x /= 10;
            }
            System.out.println(res-1);
            for (Integer i : list){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
