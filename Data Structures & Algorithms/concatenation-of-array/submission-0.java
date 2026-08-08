class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int size = 2*n;
        int[] ans = new int[size];
        int k=0;
        for(int i : nums)
        {
            ans[k++]=i;
        }
        for(int i=k;i<size;i++)
        {
            ans[k++]=nums[i-n];
        }
        return ans;
    }
}