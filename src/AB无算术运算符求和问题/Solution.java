package AB无算术运算符求和问题;

public class Solution {

	public static void main(String[] args) {
		int a=-1;
		int b=-2;
		System.out.println(new Solution().aplusb(a, b));
	}
	public int aplusb(int a, int b) {
		if((a>>31&1)==1&&(b>>31&1)==1) {
			//均为负数
			System.out.println("a<0,b<0");
			int result=(a<< 1)|(b<<1);
			System.out.println("result="+result);
			return (result>>1);
		}else if((a>>31&1)==1&&(b>>31&1)==0) {
			//a负b正
			System.out.println("a>0,b<0");
			
		}else if((a>>31&1)==0&&(b>>31&1)==1) {
			//a正b负
			System.out.println("a<0,b>0");
			
		}else {
			//均为正数
			System.out.println("a>0,b>0");
			return a|b;
		}
		return a&b;
	}
}
