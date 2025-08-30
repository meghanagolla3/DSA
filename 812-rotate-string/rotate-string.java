class Solution {
    public boolean rotateString(String s, String goal) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        for(int i = 0; i < charArray.length; i++){
            char first = charArray[0];
            for (int j = 0; j < n - 1; j++) {
                charArray[j] = charArray[j + 1];
            }
            charArray[n - 1] = first;
            String str = new String(charArray);
            if(str.equals(goal)){
                return true;
            }
        }
        return false;
    }
}