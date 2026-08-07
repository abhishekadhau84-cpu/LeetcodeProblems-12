class Solution {
    public int countHomogenous(String s) {
        
        long ans=0;
        long count=0;

        for(int i=0;i<s.length();i++)
        {
            if(i>0 && s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
                count=1;
            }
            ans+=count;
        }
        return (int)(ans%1000000007);
    }
}