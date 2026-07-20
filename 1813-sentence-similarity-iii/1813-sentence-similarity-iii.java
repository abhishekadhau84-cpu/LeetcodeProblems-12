class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        
        String[] s1=sentence1.split(" ");
        String[] s2=sentence2.split(" ");

        if(s1.length > s2.length)
        {
            String[] temp=s1;
            s1 = s2;
            s2 = temp;
        }
        int left = 0;
        while(left < s1.length && s1[left].equals(s2[left]))
        {
            left++;
        }
        int right=0;
        while(right<s1.length-left && s1[s1.length -1-right].equals(s2[s2.length - 1 -right]))
        {
            right++;
        }
        return left+right ==s1.length;
    }
}