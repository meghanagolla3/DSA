class Solution {
    public int differenceOfSum(int[] arr) {
        int sum = 0;
        int sum1 = 0;
//        int total_sum = 0;
        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];

                while(arr[i] > 0){
                    int r = arr[i] % 10;
                    sum1 = sum1 + r;
                    arr[i] = arr[i] /10;
                }


        }
        int total_sum = sum-sum1;
        return total_sum;
    }
}