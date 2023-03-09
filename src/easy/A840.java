package easy;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-03-05 18:28
 * @Description: TODO
 */

public class A840 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n -- > 0){
            char op = in.next().charAt(0);
            int a = in.nextInt();
            if (op == 'I') set.add(a);
            else {
                if (set.contains(a)) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}
