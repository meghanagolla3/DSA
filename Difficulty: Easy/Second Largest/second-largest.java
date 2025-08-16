class Solution {
    public int getSecondLargest(int[] arr) {
        int firstMax =-1;
        int secondMax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > firstMax){
                firstMax = arr[i];
            }
        }
        for (int i=0; i< arr.length;i++){
            if(arr[i]>secondMax && arr[i]!= firstMax){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}