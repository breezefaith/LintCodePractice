package 报数;

/***
 * 报数指的是，按照其中的整数的顺序进行报数，然后得到下一个数。如下所示：
     1, 11, 21, 1211, 111221, ...
     1 读作 "one 1" -> 11.
     11 读作 "two 1s" -> 21.
     21 读作 "one 2, then one 1" -> 1211.
     给定一个整数 n, 返回 第 n 个顺序。
 * 样例
    给定 n = 5, 返回 "111221".
 */
public class Solution {

    public static void main(String []args){
        System.out.println(new Solution().countAndSay(5));
    }

    public String countAndSay(int n) {
        if (n<=0){
            return "";
        }
        if(n==1){
            return "1";
        }
        StringBuffer sb=new StringBuffer("1");
        for (int i=1;i<n;i++){
            int j=0;
            int len=sb.length();
            for (;j<len;){
                if(j==len-1){
                    if (sb.charAt(j)=='1'){
                        sb.replace(j,j+1,"11");
                        j=j+2;
                    }
                    continue;
                }
                if(sb.charAt(j)=='1'&&sb.charAt(j+1)!='1'){
                    sb.replace(j,j+1,"11");
                    j=j+2;
                }else if (sb.charAt(j)=='1'&&sb.charAt(j+1)=='1'){
                    sb.replace(j,j+2,"21");
                    j=j+2;
                }else if (sb.charAt(j)=='2'){
                    try {
                        if(j+1==len-1&&sb.charAt(j+1)=='1'){
                            sb.replace(j,j+2,"1211");
                            j=j+4;
                            continue;
                        }
                        if (sb.charAt(j+1)=='1'&&sb.charAt(j+2)!='1'){
                            sb.replace(j,j+2,"1211");
                            j=j+4;
                        }else if (sb.charAt(j+1)=='1'&&sb.charAt(j+2)!='1'){
                            sb.replace(j,j+2,"122");
                            j=j+3;
                        }
                    }catch (StringIndexOutOfBoundsException e){

                    }


                }else{
                    j=len+1;
                }
            }
        }
        return new String(sb);
    }

}
