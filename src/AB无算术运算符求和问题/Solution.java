package AB无算术运算符求和问题;

public class Solution {

	public static void main(String[] args) {
		int a=4;
		int b=6;
//		System.out.println(~((-c)^1)==c);
		System.out.println(new Solution().aplusb(a, b));
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @note
	 * 若c<0，则~(c^1)=|c|
	 */
	public int aplusb(int a, int b) {
		if((a>>31&1)==1&&(b>>31&1)==1) {
			//均为负数
			System.out.println("a<0,b<0");
			int absA=~(a^1);
			int absB=~(b^1);
			System.out.println(absA+" "+absB);
			int result=(absA|absB);
			System.out.println("result="+result);
			return (result);
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
