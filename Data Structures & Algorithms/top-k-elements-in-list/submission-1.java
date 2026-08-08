class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
     Integer[] result1 = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)   // extract only keys
                .toArray(Integer[]::new);

int[] result = Arrays.stream(result1)
                               .mapToInt(Integer::intValue)
                               .toArray();
        return result;
    }
}
