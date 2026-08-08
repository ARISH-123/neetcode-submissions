class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(char ch : s.toCharArray())
        {
            if((ch>=48 && ch<=57)||(ch>=65 && ch<=90)||(ch>=97 && ch<=122))
            {
                str+=ch;
            }
            else
            {
                continue;
            }
        }
        str=str.toLowerCase();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
       
       return rev.equals(str);
    }
}
