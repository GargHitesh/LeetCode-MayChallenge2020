/*Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/

import java.util.*;
class Solution {
public int firstUniqChar(String s) {

    HashMap<Character,Integer> m =new HashMap<>();
    int uniqCharIndex=Integer.MAX_VALUE;
    for(int j=0;j<s.length();j++)
    {
       if(!m.containsKey(s.charAt(j)))
        {
            m.put(s.charAt(j),j);
        }
        else
        {
            m.put(s.charAt(j),Integer.MAX_VALUE);
        }
    }
    for(int i=0;i<s.length();i++)
    {
        uniqCharIndex= Math.min(uniqCharIndex,m.get(s.charAt(i)));
    }
    if(uniqCharIndex==Integer.MAX_VALUE)
        uniqCharIndex=-1;
         
    return uniqCharIndex;
    
    }
}