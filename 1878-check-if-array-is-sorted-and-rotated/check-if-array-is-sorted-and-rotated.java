class Solution {
    public boolean check(int[] arr) {
        int k=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                k = i+1;
            }
        }
        reverse(arr,0, k-1);
        reverse(arr, k+1-1, arr.length-1);
        reverse(arr,0, arr.length-1);

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void reverse(int[] arr,int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}