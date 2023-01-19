package easy;

import java.io.*;
import java.util.*;

public class A4510 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static int n, l, s;

    static class PII {
        int x, y;
        public PII(int a, int b) {
            x = a;
            y = b;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PII pii = (PII) o;
            return x == pii.x && y == pii.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) throws IOException {
        String[] s1 = in.readLine().split(" ");
        n = Integer.parseInt(s1[0]); l = Integer.parseInt(s1[1]); s = Integer.parseInt(s1[2]);
        Set<PII> set = new HashSet<>();
        for (int i = 0; i < n; i ++) {
            String[] s2 = in.readLine().split(" ");
            set.add(new PII(Integer.parseInt(s2[0]), Integer.parseInt(s2[1])));
        }
        boolean[][] b = new boolean[s + 1][s + 1];
        for (int i = s; i >= 0; i --) {
            String[] s3 = in.readLine().split(" ");
            for (int j = 0; j <= s; j ++)
                b[i][j] = Integer.parseInt(s3[j]) == 1;
        }
        int res = 0;
        for (PII p : set) {
            int x = p.x, y = p.y;
            if (x + s > l || y + s > l) continue;
            boolean isV = true;
            for (int i = x; i <= x + s; i ++) {
                for (int j = y; j <= y + s; j ++)
                    if (b[i - x][j - y] != set.contains(new PII(i, j))) {
                        isV = false;
                        break;
                    }
                if (!isV) break;
            }
            if (isV) res ++;
        }
        out.println(res);
        out.flush();
    }
}

