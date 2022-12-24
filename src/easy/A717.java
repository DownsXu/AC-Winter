package easy;

import java.io.*;

public class A717 {

    static int n = 0;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(in.readLine());
        int a = 0, b = 1, c = 0;
        for(int i = 1; i <= n ; i ++){
            out.write(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
        in.close();
        out.flush();
        out.close();
    }
}
