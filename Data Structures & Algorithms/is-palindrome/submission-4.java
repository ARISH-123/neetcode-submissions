class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String rev="";
        String str = "";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
           if((ch>=97 && ch<=122)||(ch>=48 && ch<=57))
           {
            str+=ch;
           }
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            rev+=ch;
        }
        if(rev.equals(str))
        return true;
        else
        return false;
    }
}
