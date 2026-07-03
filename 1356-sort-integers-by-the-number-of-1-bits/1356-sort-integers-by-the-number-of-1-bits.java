class Solution {
    public int[] sortByBits(int[] arr) {
        
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int bit1 = Integer.bitCount(arr[i]);

                int bit2 = Integer.bitCount(arr[j]);

                if(bit1>bit2)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else if(bit1==bit2 && arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}