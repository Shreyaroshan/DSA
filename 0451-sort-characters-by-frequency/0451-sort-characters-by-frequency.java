class Solution {
    public String frequencySort(String s) {
        StringBuilder str=new StringBuilder();
        HashMap <Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList <Character> chars=new ArrayList<>(map.keySet());
        chars.sort((a,b)->map.get(b)-map.get(a));
        for(char ch:chars)
        {
            int count=map.get(ch);
            for(int i=0;i<count;i++)
            str.append(ch);
        }
        return str.toString();
    }
}