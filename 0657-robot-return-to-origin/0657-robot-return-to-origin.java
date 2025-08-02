class Solution {
    public boolean judgeCircle(String moves) {
        int u=0,d=0,r=0,l=0;
        for(char ch:moves.toCharArray())
        {
            if(ch=='U')
            u++;
            if(ch=='R')
            r++;
            if(ch=='D')
            d++;
            if(ch=='L')
            l++;
        }
        if(l==r&&u==d)
        return true;
        return false;
    }
}