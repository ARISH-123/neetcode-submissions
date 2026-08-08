class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs)
        {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            if(map.containsKey(String.valueOf(arr)))
            {
                map.get(String.valueOf(arr)).add(str);
            }
            else
            {
                map.put(String.valueOf(arr),new ArrayList<>());
                map.get(String.valueOf(arr)).add(str);
            }
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
        //return new ArrayList<>(map.values());
    }
}
