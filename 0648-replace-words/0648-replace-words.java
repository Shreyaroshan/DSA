class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        dictionary.sort((a, b) -> a.length() - b.length());
        String wordbreak[]=sentence.split("\\s+");
        for(int i=0;i<wordbreak.length;i++)
        {
            for(int j=0;j<dictionary.size();j++)
            {
                if (wordbreak[i].startsWith(dictionary.get(j)))
                {
                    wordbreak[i]=dictionary.get(j);
                    break;
                }
            }
        }
        String result = String.join(" ", wordbreak);

        return result;
    }
}