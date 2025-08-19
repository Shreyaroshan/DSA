class Solution {
    public int findPeakElement(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l-1;i++)
        {
            if(nums[i]>nums[i+1])
            return i;
        }
        return l-1;
    }
}