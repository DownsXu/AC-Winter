package easy;

import java.util.HashSet;
import java.util.Scanner;

public class A1460 {
    static String str;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        str = in.next();
        int l = 0, r = n - 1;
        while (l < r){
            int mid = l + r >> 1;
            if (check(mid)) r = mid;
            else l = mid + 1;
        }
        System.out.println(l);
    }


    // ABC DEF
    public static boolean check(int k){
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i + k - 1 < str.length(); i ++){
            String s = str.substring(i, i+k);
            if(set.contains(s)) return false;
            set.add(s);
        }
        return true;
    }
}
