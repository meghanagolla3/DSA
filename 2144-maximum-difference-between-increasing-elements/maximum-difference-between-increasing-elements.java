class Solution {
    public int maximumDifference(int[] arr) {
        int small = arr[0];
        int big =  arr[0];
        int max_diff =-1;
        for(int i=1;i<arr.length;i++)
        {
            
            
            if(arr[i]<small){
                small = arr[i];
                big = arr[i];
            }
            else if(arr[i]>big){
                big = arr[i];
            }
            
            int d = (big-small)>0?big-small:-1;
            if(max_diff<d)
            {
                max_diff = d;
            }
            
            
        }
        return max_diff;
    }
}