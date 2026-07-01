class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int left =0;
        int right=1;

        int[] result=new int[nums.length];

        for(int num : nums)
        {
            if(num % 2==0)
            {
                result[left]=num;
                left=left+2;
            }
            else
            {
                result[right]=num;
                right=right+2;
            }
        }
        return result;

    }
}