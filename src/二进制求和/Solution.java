package 二进制求和;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * @param a: a number
	 * @param b: a number
	 * @return: the result
	 */
	public String addBinary(String a, String b) {
		int c=0;
		int i=a.length()-1;
		int j=b.length()-1;
		StringBuffer sb=new StringBuffer();
		for(;i>=0&&j>=0;i--,j--) {
			c=bitSum(sb, a.charAt(i)-'0', b.charAt(j)-'0', c);
		}

		if(i<0&&j>=0) {
			for(;j>=0;j--) {
				c=bitSum(sb,b.charAt(j)-'0',0,c);
			}
		}else if(j<0&&i>=0) {
			for(;i>=0;i--) {
				c=bitSum(sb,a.charAt(i)-'0',0,c);
			}
		}else {

		}
		if(c==1) {
			sb.append(1);
		}
		return new String(sb.reverse());
	}
	public int bitSum(StringBuffer sb, int a,int b,int c) {
		int bitSum=a+b+c;
		switch(bitSum) {
		case 0:
			c=0;
			break;
		case 1:
			c=0;
			break;
		case 2:
			bitSum=0;
			c=1;
			break;
		case 3:
			bitSum=1;
			c=1;
			break;
		default:
			break;
		}
		sb.append(bitSum);
		return c;
	}
}
