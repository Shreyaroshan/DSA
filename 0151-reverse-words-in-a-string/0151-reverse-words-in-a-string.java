class Solution {
    public String reverseWords(String s) {
        StringBuilder result=new StringBuilder();
        String words[]=s.trim().split("\\s+");
        for(int i=words.length-1;i>=0;i--)
        {
            result.append(words[i]);
            result.append(" ");
        }
        String str=result.toString();
        str=str.trim();
        return str;
    }
}