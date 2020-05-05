Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
_____________________________________________
class Solution {
    public static char flip(char c){
        
        return (c=='0')?'1':'0';
        
    }
    public int findComplement(int num) {
      
        String binaryString = Integer.toBinaryString(num);
        String res="";
        for(int i=0;i<binaryString.length();i++)
        res+=flip(binaryString.charAt(i));
        
        return Integer.parseInt(res,2);
        
       
    }
}