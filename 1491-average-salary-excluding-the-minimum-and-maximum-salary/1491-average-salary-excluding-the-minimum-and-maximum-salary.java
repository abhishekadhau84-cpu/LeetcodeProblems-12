class Solution {
    public double average(int[] salary) {
        
        for(int i=0;i<salary.length-1;i++)
        {
            for(int j=i+1;j<salary.length;j++)
            {
                if(salary[j]>salary[i])
                {
                    int temp=salary[i];
                    salary[i]=salary[j];
                    salary[j]=temp;
                }
            }
        }
        int num=0;
        int min=salary[0];
        int max=salary[salary.length-1];
        for(int i=0;i<salary.length;i++)
        {
            num=num+salary[i];
        }
        double avg=(double)(num-min-max)/(salary.length-2);
        return avg;
    }
}