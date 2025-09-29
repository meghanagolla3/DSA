bool isPalindrome(int x) {
     long a=x,n=0,s;
     if(x<0) return false;
    if(x/10==0) return true;
    while(x>0){
        s=x%10;
        n=n*10+s;
        x=x/10;
    }
    if(n==a) return true;
    else return false;
}