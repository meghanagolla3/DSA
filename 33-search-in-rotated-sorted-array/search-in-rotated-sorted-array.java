class Solution {
    public int search(int[] arr, int target) {
        // Arrays.sort(nums);
        int low = 0;
        int right = arr.length-1;
        // int ans = 0;
        while(low <= right){
            int mid = low+(right-low)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] >= arr[low]){
                if(arr[low] <=target && target <= arr[mid]){
                    right = mid - 1;
                }else{
                    low = mid+1;
                }
            }else {
                if(arr[mid] <= target && target <= arr[right] ){
                    low = mid + 1;
                }else{
                    right = mid -1;
                }
            }
        }  
        return -1; 
    }
}