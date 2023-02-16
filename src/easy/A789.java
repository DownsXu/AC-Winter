package easy;

import java.util.Scanner;

public class A789 {
    static final int N = 100010;
    static int[] a = new int[N];
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int q = in.nextInt();
        for (int i = 0; i < n; i ++)
            a[i] = in.nextInt();

        while (q -- > 0){
            int k = in.nextInt();
            int l = SL(k);
            int r = -1;
            if (l != -1){
                r = SR(k);
            }
            System.out.println(l + " " + r);
        }
    }

    public static int SL(int k){ //查找左边界 [0,mid][mid+1,n-1]
        int l = 0, r = n-1;
        while (l < r){
            int mid = l + r >> 1;
            if (a[mid] >= k) r = mid;
            else l = mid + 1;
        }
        if (a[l] == k) return l;
        else return -1;
    }

    public static int SR(int k){ //查找右边界 [0,mid-1][mid,n-1]
        int l = 0, r = n-1;
        while (l < r){
            int mid = l + r + 1 >> 1;
            if (a[mid] <= k) l = mid;
            else r = mid - 1;
        }
        if (a[l] == k) return l;
        else return -1;
    }
}
