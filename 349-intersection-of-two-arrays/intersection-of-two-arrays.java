class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // First, sort both arrays for two-pointer technique
        java.util.Arrays.sort(nums1);
        java.util.Arrays.sort(nums2);

        int count = ans1(nums1, nums2);
        int[] arr = new int[count];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // Avoid duplicates
                if (k == 0 || arr[k - 1] != nums1[i]) {
                    arr[k++] = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return arr;
    }

    public static int ans1(int[] nums1, int[] nums2) {
        int count = 0;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                count++;
                int val = nums1[i];
                // Skip duplicates in both arrays
                while (i < nums1.length && nums1[i] == val) i++;
                while (j < nums2.length && nums2[j] == val) j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }
}