class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=0;
        int index=0;
        int[] max=new int[nums.length*nums.length];
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                max[index++]=(nums[i]-1)*(nums[j]-1);
            }
        }
        Arrays.sort(max);
        return maxProduct=max[max.length-1];

    }
}