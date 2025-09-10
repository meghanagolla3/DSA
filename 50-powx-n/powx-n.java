class Solution {
    public double pow(double x,long n)
    {
        if(n==0)
        {
            return 1.0;
        }
        double temp = pow(x, n / 2);

        if (n % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }
    public double myPow(double x, int n) {
        long N = n;
        if (x == 0 && N < 0) {
            return Double.POSITIVE_INFINITY; // or throw exception
        }
        if(n<0)
        {
            x = 1/x;
            N =-N;
        }
            return pow(x,N);
        
    }

}