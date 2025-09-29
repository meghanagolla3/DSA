int reverse(int x){
    long s,l=0,m;
    if(x/10==0) return x;
    if(x>0){
        while(x>0){
            s=x%10;
            x/=10;
            l=l+s;
            l=l*10;
        }
    }
    int n=0;
    if(x<0){
        n=1;
        if(x==-pow(2,31)){
            m=x;
            m=-m;
        }
        else{
            m=-x;
        }
        while(m>0){
            s=m%10;
            m/=10;
            l=l+s;
            l=l*10;
        }

    }
    if(n==1) x=-l/10;
    else x=l/10;
    if(l/10>pow(2,31)) return 0;
    return x;
}