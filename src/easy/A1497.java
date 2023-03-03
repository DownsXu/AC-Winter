package easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @BelongsProject: AC-Winter
 * @BelongsPackage: easy
 * @Author: DownsXu
 * @Date: 2023-02-26 21:00
 * @Description: TODO
 */
public class A1497 {
    static int N = 35;
    static int[] prorder = new int[N];
    static int[] miorder = new int[N];
    static int[] idx = new int[N];
    static HashMap<Integer, Integer> lr = new HashMap<>();
    static HashMap<Integer, Integer> rr = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i ++){
            prorder[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i ++){
            miorder[i] = in.nextInt();
            idx[miorder[i]] = i;
        }

        int root = build(1, n, 1, n);
        bfs(root);
    }

    private static void bfs(int root) {
        LinkedList<Integer> l = new LinkedList<>();
        l.push(root);
        while (!l.isEmpty()){
            int t = l.poll();
            System.out.print(t + " ");
            if(lr.containsKey(t)) l.push(lr.get(t));
            if(rr.containsKey(t)) l.push(rr.get(t));
        }
    }

    private static int build(int il, int ir, int pl, int pr) {
        int root = prorder[pr];
        int k = idx[root];

        if (il < k) lr.put(root, build(il, k-1, pl, pl+(k-1)-il));
        if (ir > k) rr.put(root, build(k+1, ir, pl+(k-1)-il+1, pr-1));
        return root;
    }
}
