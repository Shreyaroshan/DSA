class Solution {
    public int maxProduct(int[] nums) {
        int maxlength=Integer.MIN_VALUE;
        int n=nums.length;
        int fp=Integer.MIN_VALUE;
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int p=1;
            for(int j=i;j<n;j++)
            {
               p*=nums[j];
               if(p>fp)
               {
                fp=p;
               }
            }
        }
        return fp;
    }
}