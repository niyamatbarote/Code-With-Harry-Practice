package DSA;

import java.util.Scanner;

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

    // // Digit Counter:-
    // static void countDigit(int num){
    //     int odd = 0;
    //     int even = 0;
    //     int count = 0;

    //     if (num == 0) {
    //         count =1;
    //         System.out.println("It has only 1 Digit");
    //     }else{
    //         while (num!=0) {
    //             num /= 10;
    //             count ++;
    //         }
    //     }
    //     System.out.println("This Number has "+count+" Digits");
        
    //     if (count == 1) {
    //         System.out.println("THe Number is of ODD Digits");   
    //     }
    //     else if (count/2==0) {
    //         System.out.println("The Number is of Even Digits");
    //     }else{
    //         System.out.println("The Number is of Odd Digits");
    //     }
    // }



    // 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] accounts = {
            {1,2,7},
            {3,2,1}
        };
        System.out.println(maxWealth(accounts));
        
    }
}
