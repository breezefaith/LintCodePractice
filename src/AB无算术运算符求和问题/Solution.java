package AB������������������;

public class Solution {

	public static void main(String[] args) {
		int a=-1;
		int b=-2;
		System.out.println(new Solution().aplusb(a, b));
	}
	public int aplusb(int a, int b) {
		if((a>>31&1)==1&&(b>>31&1)==1) {
			//��Ϊ����
			System.out.println("a<0,b<0");
			int result=(a<< 1)|(b<<1);
			System.out.println("result="+result);
			return (result>>1);
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
