package AB������������������;

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
	 * ��c<0����~(c^1)=|c|
	 */
	public int aplusb(int a, int b) {
		if((a>>31&1)==1&&(b>>31&1)==1) {
			//��Ϊ����
			System.out.println("a<0,b<0");
			int absA=~(a^1);
			int absB=~(b^1);
			System.out.println(absA+" "+absB);
			int result=(absA|absB);
			System.out.println("result="+result);
			return (result);
		}else if((a>>31&1)==1&&(b>>31&1)==0) {
			//a��b��
			System.out.println("a>0,b<0");
			
		}else if((a>>31&1)==0&&(b>>31&1)==1) {
			//a��b��
			System.out.println("a<0,b>0");
			
		}else {
			//��Ϊ����
			System.out.println("a>0,b>0");
			return a|b;
		}
		return a&b;
	}
}
