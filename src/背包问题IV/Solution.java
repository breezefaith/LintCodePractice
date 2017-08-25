package 背包问题IV;

public class Solution {
    public static void main(String []args){
        int []array={2,3};
        int target=7;
        System.out.println(new Solution().backPackVI(array,target));
    }
    public int backPackVI(int[] array, int target) {
        if(array==null){
            return 0;
        }
        return f2(array,target);
    }
    //迭代方法
    public int f2(int []array,int target){
        if(target==0){
            return 1;
        }
        int result=0;
        int n=array.length;
        int []dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<target+1;i++){
            for(int j=0;j<n;j++){
                if(array[j]<=i){
                    dp[i]+=dp[i-array[j]];
                }
            }
        }
        result=dp[target];
        return result;
    }
    //递归方法时间超限
    public int f(int []array,int target){
        if(target==0){
            return 1;
        }
        if(target<0){
            return 0;
        }
        int result=0;
        int sum=0;
        for (int i=0;i<array.length;i++){
            if(array[i]==target){
                result=result+1;
            }else if(array[i]<target){
                result += f(array, target - array[i]);
            }
        }
//        System.out.println("result="+result+"\n");
        return result;
    }
}
