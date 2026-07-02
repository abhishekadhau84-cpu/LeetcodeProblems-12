class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        
        int[][] result = new int[rows*cols][2];

        int index = 0;

        for(int i = 0;i < rows;i++)
        {
            for(int j = 0;j < cols;j++)
            {
                result[index][0]=i;
                result[index][1]=j;
                index++;
            }
        }
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result.length -1 - i;j++)
            {
                int d1 =Math.abs(result[j][0] - rCenter)
                +
                Math.abs(result[j][1] - cCenter);

                int d2=Math.abs(result[j+1][0] - rCenter)
                +
                Math.abs(result[j+1][1] - cCenter);

                if(d1 > d2)
                {
                    int temp0 = result[j][0];
                    int temp1 = result[j][1];

                    result[j][0] = result[j+1][0];
                    result[j][1] = result[j+1][1];

                    result[j+1][0]=temp0;
                    result[j+1][1]=temp1;
                }
            }
        }
        return result;
    }
}