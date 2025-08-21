class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {

            for (int j = i; j < n; j++)

            { 
                // boolean a=false;
                if (nums[j] + nums[j-i] == target) {
                    // x[0] = i;
                    return new int [] {j-i,j};
                    // x[1] = j;
                    // a=true;
                    // break;

                }
                

            }

        }
        return null;
    
    }
}