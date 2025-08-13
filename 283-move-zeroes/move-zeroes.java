class Solution {
    public void moveZeroes(int[] arr) {
        int count=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count]=temp;
                count++;
            }
            i++;
        }
    }
}