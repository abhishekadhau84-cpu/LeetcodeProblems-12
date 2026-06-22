class Solution {
    public int subtractProductAndSum(int num) {
        
        String str=String.valueOf(num);

        int[] arr = new int[str.length()];

        int mul=1;
        int count=0;

        for(int i=0;i<str.length();i++)
        {
            arr[i] = str.charAt(i) - '0';

            mul=mul*arr[i];
            count=count+arr[i];
        }
        return mul-count;

    }
}