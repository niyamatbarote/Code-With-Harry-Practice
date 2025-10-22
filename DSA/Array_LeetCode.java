package DSA;

public class Array_LeetCode {

    // Find The Richest Customer Wealth Problem N0. --> 1672
    // https://leetcode.com/problems/richest-customer-wealth/?envType=problem-list-v2&envId=vrww4tkr

    static int maxWealth(int [][] accounts){
        int wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            
        }
        return wealth;
    }
    public static void main(String[] args) {
        int [][] accounts = {
            {1,2,3},
            {3,2,1}
        };
        System.out.println(maxWealth(accounts));

    }
}
