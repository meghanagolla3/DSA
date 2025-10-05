class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2) .equals(str2 + str1)){
            return "";
        }
        int len = gcd(str1.length(), str2.length());
        return str1.substring(0, len);

    }
    public int gcd(int a, int b){
        int i ;
        if(a < b){
            i = a;
        }else{
            i = b;
        }
        for(i = i; i>1; i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
}