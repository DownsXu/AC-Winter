package easy;

import java.util.ArrayList;
import java.util.Scanner;

public class A3777 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t -- > 0){
            int n = in.nextInt();
            String s = in.next();
            char[] ch1 = s.toCharArray();
            char[] ch2 = s.toCharArray();
            int res1 = 0, res2 = 0;
            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Integer> l2 = new ArrayList<>();

            for (int i = 0; i < n-1; i ++){
                //转换为白色
                if (ch1[i] == 'B'){
                    ch1[i] = 'W';
                    if (ch1[i+1] == 'W') ch1[i+1] = 'B';
                    else ch1[i+1] = 'W';
                    l1.add(i+1);
                    res1 ++;
                }

                //转换为黑色
                if (ch2[i] == 'W'){
                    ch2[i] = 'B';
                    if (ch2[i+1] == 'W') ch2[i+1] = 'B';
                    else ch2[i+1] = 'W';
                    l2.add(i+1);
                    res2 ++;
                }
            }

            if (ch1[n-1] != 'W' && ch2[n-1] != 'B') System.out.println(-1);
            else if(ch1[n-1] != 'W'){
                System.out.println(res2);
                for (Integer i : l2) System.out.print(i + " ");
                System.out.println();
            }else {
                System.out.println(res1);
                for (Integer i : l1) System.out.print(i + " ");
                System.out.println();
            }
        }
    }
}
