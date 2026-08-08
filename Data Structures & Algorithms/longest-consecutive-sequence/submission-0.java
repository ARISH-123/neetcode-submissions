class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        int length=0;
        for(int i : nums)
        {
            set.add(i);
        }
        for(int i : nums)
        {
            length=1;
            if(!set.contains(i-1))
            {
                while(set.contains(i+length))
                {
                    length++;
                }
            }
            longest = Math.max(length,longest);
        }
        return longest;
    }
}
//Sort
// Take a set, get starting point of every sequence
//Check length for each