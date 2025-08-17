class Solution {
    public int removeDuplicates(int[] arr) {
       int idx = 1;
        int i=1;
        while(i<arr.length){
            if(arr[i]!=arr[i-1]){
                arr[idx] = arr[i];
                idx++;

            }
            i++;
        }
         return idx;
    }
}