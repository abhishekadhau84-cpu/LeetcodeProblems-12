class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int square[]=new int[nums.length];
        for(int i=0;i<=nums.length-1;i++)
        {
            square[i]=nums[i]*nums[i];
        }
        Arrays.sort(square);
        return square;
    }
}