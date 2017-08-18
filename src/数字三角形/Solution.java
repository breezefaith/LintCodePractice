package Êý×ÖÈý½ÇÐÎ;

public class Solution {

	public static void main(String[] args) {
		int [][]array= {};
		System.out.println(new Solution().minimumTotal(array));
	}
	public int minimumTotal(int[][] triangle) {
        if(triangle==null||triangle.length==0)
        	return 0;
        
		int [][]dp=new int[triangle.length][];
        dp[0]=new int[1];
        dp[0][0]=triangle[0][0];
        
        int cols=0;
        int currentMin=dp[0][0];
        
        for(int i=1;i<triangle.length;i++) {
        	cols=triangle[i].length;
        	dp[i]=new int[cols];
        	dp[i][0]=dp[i-1][0]+triangle[i][0];
        	currentMin=dp[i][0];
        	for(int j=1;j<cols-1;j++) {
        		dp[i][j]=Integer.min(dp[i-1][j-1], dp[i-1][j])+triangle[i][j];
        		if(currentMin>dp[i][j]) {
        			currentMin=dp[i][j];
        		}
        	}
        	dp[i][cols-1]=dp[i-1][cols-2]+triangle[i][cols-1];
        	if(currentMin>dp[i][cols-1]) {
    			currentMin=dp[i][cols-1];
    		}
        }
        return currentMin;
	}
}
