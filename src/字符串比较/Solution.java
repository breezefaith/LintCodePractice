package �ַ����Ƚ�;


/**
 * �Ƚ������ַ���A��B��ȷ��A���Ƿ����B�����е��ַ����ַ���A��B�е��ַ����Ǵ�д��ĸ
 * ע������:
 * �� A �г��ֵ� B �ַ�������ַ�����Ҫ������������
 * ����:
 * ���� A = "ABCD" B = "ACD"������ true
 * ���� A = "ABCD" B = "AABC"�� ���� false
 */

public class Solution {
    public boolean compareStrings(String A, String B) {
        int []a=new int[26];
        int []b=new int[26];
        for(int i=0;i<A.length();i++){
            a[A.charAt(i)-'A']++;
        }
        for(int i=0;i<B.length();i++){
            b[B.charAt(i)-'A']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]<b[i]){
                return false;
            }
        }
        return true;

    }
}
