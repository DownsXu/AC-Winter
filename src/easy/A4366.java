package easy;

import java.io.*;

public class A4366 {
    static int t;
    static int n;
    static int N = 100010;
    static int[] a = new int[N];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        t = Integer.parseInt(in.readLine());
        while (t-- != 0){
            int sum = 0;
            int mm = 0x3fff;
            n = Integer.parseInt(in.readLine());
            String[] str = in.readLine().split(" ");
            for(int i = 0; i < n; i ++){
                a[i] = Integer.parseInt(str[i]);
                sum += a[i];
            }
            if(sum == 0) out.write(0);
            else {
                for(int i = 1; i <= Math.sqrt(sum); i++){
                    if(sum % i == 0) mm = Math.min(mm, Math.min(check(i), check(sum/i)));
                }
                System.out.println(mm);
            }
        }
        in.close();
        out.flush();
        out.close();
    }

    static int check(int k){
        int s = 0;
        int cnt = 0;
        int res = 0;
        for(int i = 0; i < n; i ++){
            s += a[i];
            cnt ++;
            if(s == k){
                s = 0;
                res += cnt -1;
                cnt = 0;
            }
            if(s > k) return 0x3fff;
        }
        return res;
    }
}