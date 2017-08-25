package 字符串比较;


/**
 * 比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是大写字母
 * 注意事项:
 * 在 A 中出现的 B 字符串里的字符不需要连续或者有序。
 * 样例:
 * 给出 A = "ABCD" B = "ACD"，返回 true
 * 给出 A = "ABCD" B = "AABC"， 返回 false
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
