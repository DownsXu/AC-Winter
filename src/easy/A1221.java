package easy;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A1221 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, int[]> map = new HashMap<>();

        for (int c = 0; c * c <= n; c++) {
            for (int d = c; d * d + c * c <=n; d++) {
                int sum = c * c + d * d;
                if (!map.containsKey(sum)) {
                    map.put(sum, new int[]{c, d});
                }
            }
        }

        for (int a = 0; a * a <= n; a++) {
            for(int b = a; b * b + a * a <= n; b++) {
                int t =  n - (a * a + b * b);
                if (map.containsKey(t)) {
                    System.out.println(a + " " + b + " " + map.get(t)[0] + " " + map.get(t)[1]);
                    return;
                }
            }
        }
    }
}
