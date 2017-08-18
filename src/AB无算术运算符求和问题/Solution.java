package ABÎÞËãÊõÔËËã·ûÇóºÍÎÊÌâ;

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
	 * Èôc<0£¬Ôò~(c^1)=|c|
	 */
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
