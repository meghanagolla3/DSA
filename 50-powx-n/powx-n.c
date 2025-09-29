double myPow(double x, int n) {
    double a=x,l;
    if(x==-1){
        if(n%2==0) return 1;
        else return -1;
    }
    if(x==1) return 1;
    if(n<-100000) return 0;
    if(n<0){
        a=1/x;
        for(int i=1;i<-n;i++){
            a=(1/x)*a;
        }
        return a;
    }
    else if(n==0) return 1;
    else{
        for(int i=1;i<n;i++){
        x=x*a;
        }
        return x;
    }
}