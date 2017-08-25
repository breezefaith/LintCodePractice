package 二进制1的个数;

/***
 * 计算在一个 32 位的整数的二进制表示中有多少个 1.
 * 样例
 * 给定 32 (100000)，返回 1
 * 给定 5 (101)，返回 2
 * 给定 1023 (111111111)，返回 9
 */
public class Solution {

    public void main(String []args){

    }
    public int countOnes(int num){
        if(num>=0){
            return countOnes1(num);
        }else{
            int count=0;
            String strNum=Integer.toBinaryString(num);
            for (int i=0;i<strNum.length();i++){
                if(strNum.charAt(i)=='1'){
                    count++;
                }
            }
            return count;
        }
    }
    /***
     * 非负数的计算方法
     * @param num
     * @return
     */
    public int countOnes1(int num) {
        int count=0;
        while(num>0){
            count++;
            num=num&(num-1);
        }
        return count;
    }
}
