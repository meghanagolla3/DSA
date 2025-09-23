class Solution {
    public void generate(char[] arr, int idx, int open, int close, List<String> ans, int n){
        if(idx == n*2){
            StringBuilder sb = new StringBuilder();
            for(char ch : arr){
                sb.append(ch);
            }
            ans.add(sb.toString());
        }
        if(open < n){
            arr[idx] = '(';
            generate(arr, idx+1, open+1, close, ans, n);
        }
        if(close< open){
            arr[idx] = ')';
            generate(arr, idx+1, open, close+1, ans , n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        char[] arr = new char[n*2];
        // arr,idx,open,close
        generate(arr, 0, 0, 0,ans, n);
        return ans;
    }
}