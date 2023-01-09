package easy;

import java.util.Scanner;

public class A4652 {
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = new String();
        int c = 1189, k = 841;
        s = in.nextLine();
//        n = Integer.parseInt(s.substring(1, s.length()));
        if (s == "A0") System.out.println(c + "\n" + k);
        else {
            n = Integer.parseInt(s.substring(1, s.length()));
            for(int i = 0; i < n; i ++){
                if(c > k) c /= 2;
                else k /= 2;
            }
            if (c > k) System.out.println(c + "\n" + k);
            else System.out.println(k + "\n" + c);
        }
    }
}
