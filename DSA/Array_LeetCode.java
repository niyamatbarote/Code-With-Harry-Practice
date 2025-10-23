package DSA;

public class Array_LeetCode {

    // Find The Richest Customer Wealth Problem N0. --> 1672
    // https://leetcode.com/problems/richest-customer-wealth/?envType=problem-list-v2&envId=vrww4tkr

    static int maxWealth(int [][] accounts){
        // int max = Integer.MIN_VALUE;
        int wealth = 0;
        int wealthIndex;
        for (int i = 0; i < accounts.length; i++) {
            int sum =0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum>wealth) {
                wealth = sum;
                wealthIndex = i;
            }
            
        }
        return wealth;
    }
    public static void main(String[] args) {
        int [][] accounts = {
            {1,2,7},
            {3,2,1}
        };
        System.out.println(maxWealth(accounts));

    }
}
