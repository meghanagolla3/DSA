class Solution {
    public int removeElement(int[] arr, int val) {
        int start=0;
        int end = arr.length-1;
        int count=0;
        while(start < end){
            if(arr[start] == val && arr[end]!= val){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }else if(arr[start]!=val && arr[end] == val){
                start++;
            }else if(arr[start] != val && arr[end] != val){
                start++;
            }else{
                end--;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] !=val ){
                count++;
            }
        }
        return count;
    }
}