package 各位相加;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().addDigits(192));
	}
	public int addDigits(int num) {
		StringBuffer strNum=new StringBuffer(String.valueOf(num));
		int len=strNum.length();
		if(len==1) {
			return num;
		}
		int bitSum=0;
		while(strNum.length()!=2||strNum.charAt(0)+strNum.charAt(1)-96>=10) {
			bitSum=strNum.charAt(1)-'0'+strNum.charAt(0)-'0';
			String strBitSum=String.valueOf(bitSum);
//			System.out.println(strBitSum);
			strNum.replace(0, 2, strBitSum);
			System.out.println(strNum);
		}
		bitSum=strNum.charAt(0)+strNum.charAt(1)-96;
		return bitSum;
	}
	
}
