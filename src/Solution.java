import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s){
        Set<Character> s1 =new HashSet<>();
        int n = s.length();
//        初始状态左指针为-1，子串长度为0
        int rk = -1,ans = 0;
        for(int i=0;i<n;i++){
            if (i!=0){
                s1.remove(s.charAt(i-1));
            }
            while (rk+1<n&&!s1.contains(s.charAt(rk+1))){
                s1.add(s.charAt(rk+1));
                rk++;
            }
            ans = Math.max(ans,rk-i+1);
        }
        return ans;

    }
}
