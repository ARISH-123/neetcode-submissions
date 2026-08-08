class Solution {

    public String encode(List<String> strs) {
             StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            // Append length + delimiter + string
            encoded.append(str.length()).append('#').append(str);
        }
        return encoded.toString();

    }

    public List<String> decode(String s) {
         List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            // 1️⃣ Find the position of delimiter '#'
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }

            // 2️⃣ Extract the length prefix
            int length = Integer.parseInt(s.substring(i, j));

            // 3️⃣ Extract the string of given length
            String str = s.substring(j + 1, j + 1 + length);
            decoded.add(str);

            // 4️⃣ Move pointer forward
            i = j + 1 + length;
        }
        return decoded;
    }
}
