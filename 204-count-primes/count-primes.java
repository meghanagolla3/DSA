class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n+1];
        for(int i=0; i<=n; i++){
            arr[i] = true;
        }
        for(int p=2; p*p<=n;p++){
            if(arr[p]){
                for(int i=p*p; i<=n ; i+=p){
                    arr[i]=false;
                }
            }
        }
        int count=0;
        for(int p=2; p<n; p++ ){
            if(arr[p]){
                count++;
            }
        }
        if(n==2){
            return 0;
        }
        return count;
    }
}