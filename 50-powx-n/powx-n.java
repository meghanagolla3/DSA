class Solution {
    public double myPow(double x, int n) {
        long N = n;

        // Edge case: 0 raised to negative power is undefined
        if (x == 0 && N < 0) {
            return Double.POSITIVE_INFINITY; // or throw exception
        }

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return power(x, N);
    }

    private double power(double x, long n) {
        if (n == 0) return 1.0;
        double half = power(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
