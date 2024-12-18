package java;
/*
 * https://leetcode.com/problems/climbing-stairs/description/
 * 
 * ou are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */

public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int n = 6;
        System.out.println(climbingStairs.climbStairs(n));
    }
   


    public int climbStairs(int n) {
        int i = 0;
        int contador[] = new int[ n + 1];
        contador[0] = 1;
        contador[1] = 1;
        if(n<=3){
            return n;
        }
        for(i = 2; i<=n; i++){

            contador[i] = contador[i - 1] + contador [i - 2];
        }
        

        return contador[n];
        
    }
}
