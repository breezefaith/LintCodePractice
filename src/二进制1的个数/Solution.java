package ������1�ĸ���;

/***
 * ������һ�� 32 λ�������Ķ����Ʊ�ʾ���ж��ٸ� 1.
 * ����
 * ���� 32 (100000)������ 1
 * ���� 5 (101)������ 2
 * ���� 1023 (111111111)������ 9
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
     * �Ǹ����ļ��㷽��
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
