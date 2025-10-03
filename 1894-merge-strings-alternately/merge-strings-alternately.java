class Solution {
     public String mergeAlternately(String word1, String word2) {
        int first = 0;
        int second = 0;
        StringBuilder merge_string = new StringBuilder();
        while(first < word1.length() && second < word2.length()){

            merge_string.append(word1.charAt(first));
            merge_string.append(word2.charAt(second));
            first++;
            second++;
        }
        while(first < word1.length() || second < word2.length()){
            if(first > word1.length()-1){
                merge_string.append(word2.charAt(second));
                second++;
            }else if(second > word2.length()-1){
                merge_string.append(word1.charAt(first));
                first++;
            }
        }
        String s = merge_string.toString();
        return s;
    }
}