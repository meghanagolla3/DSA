class Solution {
    public int majorityElement(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int middle=arr[n/2];
        int count=0;
        for(int i: arr){
            if(i == middle){
                count++;
            }
            if(count > n/2){
                return i;
            }
        }

        return -1;
    }
}