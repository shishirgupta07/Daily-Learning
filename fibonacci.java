//Climbing stairs

class Solution {
    public int climbStairs(int n) {
          int ans[]=new int[n];
        if(n==1 || n==2 ||n==3)
            return n;
        ans[0]=1;
        ans[1]=2;
        int  i=2;
        for( i=2;i<n;i++)
        {
            ans[i]=ans[i-1]+ans[i-2];
        }
        
        return ans[i-1];
    }
}


//fibonacci number 
class Solution 
{
    int[] fib_cache = new int[31];
	
	public int fib(int N)
    {
        if(N <= 1)
            return N;
        else if(fib_cache[N] != 0)
            return fib_cache[N];
		else 
            return fib_cache[N] = fib(N - 1) + fib(N - 2);
    }
}


//min cost climbing 
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
            int min=0;
            int dp[]=new int[cost.length+2];
            dp[cost.length]=0;
            dp[cost.length+1]=0;
            for(int i=cost.length-1;i>=0;i--)
            {
               dp[i]=cost[i]+ Math.min(dp[i+1],dp[i+2]);
            }
           return  Math.min(dp[0],dp[1]);
    }
}