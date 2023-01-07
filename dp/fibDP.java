import java.io.*;

import java.util.*;

public class fibDP {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        int[] dp = new int[n + 1];
        int rec = rec(n, dp);
        System.out.println(rec);

        scn.close();
    }

    public static int rec(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        return dp[n] = rec(n - 1, dp) + rec(n - 2, dp);
    }
}