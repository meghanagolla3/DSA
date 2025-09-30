int uniquePaths(int m, int n) {
    int a=0;
    if(m==1 || n==1) return 1;
    a+=uniquePaths(m-1,n);
    a+=uniquePaths(m,n-1);
    return a;
}