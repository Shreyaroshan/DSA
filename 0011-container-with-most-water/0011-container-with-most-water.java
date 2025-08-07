class Solution {
    public int maxArea(int[] height) {
        int left=0; int maxarea=0;
        int right=height.length-1;
        while(left<=right)
        {
            int w=right-left;
            int minh=Math.min(height[left],height[right]);
            int area=minh*w;
            maxarea=Math.max(area,maxarea);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            right--;
        }
        return maxarea;
    }
}