package 第一个非重复字符;

import java.util.LinkedHashMap;
import java.util.Map;

/***
 * Given a string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 * 样例
    Given s = "lintcode", return 0.
    Given s = "lovelintcode", return 2.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("lintcode"));
    }
    public int firstUniqChar(String s) {
        Map<Character,Integer> countMap=new LinkedHashMap<>();
        Map<Character,Integer> indexMap=new LinkedHashMap<>();
        int index=-1;
        for (int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if (countMap.get(c)==null){
                countMap.put(c,1);
                indexMap.put(c,i);
            }else {
                countMap.put(c,countMap.get(c)+1);
            }
        }
        for (Map.Entry<Character,Integer> item:countMap.entrySet()) {
            System.out.println(item);
            if (item.getValue()==1){
                index=indexMap.get(item.getKey());
                break;
            }
        }
        return index;
    }
}
