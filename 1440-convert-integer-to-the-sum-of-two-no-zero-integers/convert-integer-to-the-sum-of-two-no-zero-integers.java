class Solution {
    public static int[] getNoZeroIntegers(int n) {
        // int i = 2;
        int a = 1;
        int b = n-1;
        while (a < n) {
            if (isNoZero(a) && isNoZero(b)) {
                return new int[]{a, b};
            }
            a++;
            b--;
        }

        return new int[]{a, b};
    }
    private static boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) return false; // contains 0
            num /= 10;
        }
        return true;
    }
}