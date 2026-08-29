class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        
        List<Boolean> result=new ArrayList<Boolean>();

        for(String query:queries)
        {
            result.add(match(query,pattern));
        }
        return result;
    }
    private boolean match(String query,String pattern)
    {
        int j=0;
        for(int i=0;i<query.length();i++)
        {
            char ch=query.charAt(i);
            if(j<pattern.length() && ch==pattern.charAt(j))
            {
                j++;
            }
            else if(Character.isUpperCase(ch))
            {
                return false;
            }
        }
        return j==pattern.length();
    }
}