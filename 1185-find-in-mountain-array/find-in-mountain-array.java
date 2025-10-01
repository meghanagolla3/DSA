/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();
        int peak = peakEle(mountainArr, 0, length-1);
        int first = orderAgnostic(mountainArr, target, 0, peak, true);
        if(first != -1){
            return first;
        }
        return orderAgnostic(mountainArr, target, peak+1, length-1, false);
      
    }

    public int orderAgnostic(MountainArray mountainArr, int target, int left, int right, boolean isAsc){
        while(left<= right){
            int mid = left +(right-left)/2;
            
            // boolean isAsc = mountainArr.get(left) < mountainArr.get(right);
            int midVal = mountainArr.get(mid);
            if(midVal== target){
                return mid;
            }
            if(isAsc){
                if(target < midVal){
                    right = mid -1;
                }else{
                    left = mid+1;
                }
            }else{
                if(target > midVal){
                    right = mid -1;
                }else{
                    left = mid+1;
                }
            }
            
        }
        return -1;
    }


    public int peakEle(MountainArray mountainArr, int left, int right){
        while(left < right){
            int mid = left +(right-left)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1)){
                right = mid;
            }else{
                left = mid +1;
            }
        }
        return left;
    }
}