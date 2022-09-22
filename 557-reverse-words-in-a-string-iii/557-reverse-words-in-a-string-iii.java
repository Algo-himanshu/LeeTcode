class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        
        sb.reverse();
        
        s=sb.toString();
        s=" "+s;
        int j=s.length()-1;
        String ss="";
        
        for(int i = s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                ss+=s.substring(i+1,j+1)+" ";
                j=i-1;
            }
        }
        return ss.trim();
    }
}