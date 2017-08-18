package AB无算术运算符求和问题;

public class Solution {

	public static void main(String[] args) {
		int a=-1;
		int b=-2;
		System.out.println(new Solution().aplusb(a, b));
	}
	public int aplusb(int a, int b) {
		int sum=0;
		int carray=0;
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		sum=a^b;
		carray=(a&b)<<1;
		return aplusb(sum,carray);
	}
}
