class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String str : strs)
        {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();

    }
    
    //Hello","World"
    // 5#Hello5#World
    //
    public List<String> decode(String str) {
        int i=0;
        List<String> decodedStrings = new ArrayList();
        while(i<str.length())
        {
        int septIndex = str.indexOf("#",i);//1
        int length = Integer.parseInt(str.substring(i,septIndex));
        i=septIndex+1;
        String decodedString = str.substring(i,i+length);
        decodedStrings.add(decodedString);
        i+=length;
        }
        return decodedStrings;
     

    }
}
