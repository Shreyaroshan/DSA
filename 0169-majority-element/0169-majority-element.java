class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int max=0;
        int maj=0;
        for(int key : map.keySet())
        {
            int k=map.get(key);
            if(k>max)
            {
                max=k;
                maj=key;
            }
        }
        return maj;
    }
}