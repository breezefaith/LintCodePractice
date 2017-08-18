package 背包问题01;

public class Solution {

	public static void main(String[] args) {
		int m=100;
		int []array= {77,22,29,50,99};
		int []value= {92,22,87,46,90};
		System.out.println(new Solution().backPackII(m, array,value));
	}
	public int backPack(int m, int[] array) {	
		
		int [][]dp=new int[array.length][m+1];
		for(int i=0;i<array.length;i++) {
			dp[i][0]=0;
		}
		for(int j=0;j<m+1;j++) {
			if(j>=array[0]) {
				dp[0][j]=array[0];
			}
		}
		
		for(int i=1;i<array.length;i++) {
			for(int j=1;j<m+1;j++) {
				if(j>=array[i]) {
					dp[i][j]=Integer.max(dp[i-1][j],dp[i-1][j-array[i]]+array[i]);
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[array.length-1][m];
	}
	public int backPackII(int m, int[] array, int[] value) {
        int [][]dp=new int[array.length][m+1];
        for(int i=0;i<array.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            if(j>=array[0]){
                dp[0][j]=value[0];
            }
        }
        for(int i=1;i<array.length;i++){
            for(int j=1;j<m+1;j++){
                if(j>=array[i]){
                    dp[i][j]=Integer.max(dp[i-1][j],dp[i-1][j-array[i]]+value[i]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[array.length-1][m];
    }
	
	//递归方法
	public int f(int []array,int j,int m) {
		if(j<0) {
			return m<0?Integer.MIN_VALUE:0;
		}
		if(m<array[j]) {
			return f(array,j-1,m);
		}
		int a=f(array,j-1,m);
		int b=f(array,j-1,m-array[j])+array[j];
		return a>b?a:b;
	}
}
