Q1->Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*******************************SOLUTION********************************

class Solution {
    
    public boolean isVisited(int index , boolean ar[]){
        
        if(ar[index]==true)
            return true;
        else{
            ar[index]=true;
            return false;
        }
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        
        boolean[] a = new boolean[magazine.length()];
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=false;
        }
     
        if(magazine.length()<ransomNote.length())
            return false;
        
      
        for(int i=0;i<ransomNote.length();i++){
            for(int j=0;j<magazine.length();j++){
                if(ransomNote.charAt(i)==magazine.charAt(j) && !isVisited(j,a)){
                    count++;
                    break;
                    
                }
            }
        }
        if(count==ransomNote.length()){
            return true;
        }
        else
            return false;
        
    }
}