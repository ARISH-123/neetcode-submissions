class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return map.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).limit(k).mapToInt(Map.Entry::getKey).toArray();

    }
}
