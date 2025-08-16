class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);

        int i=0;
        while(i<arr.length){
            if(i==arr[i]){
                i++;
            }else{
                break;
            }
        }
        return i;
    }
}