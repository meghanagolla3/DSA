class Solution {
    public String reverseWords(String s) {
        String rev = "";
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                rev = rev + s.charAt(i);
            } else {
                int start = rev.length() - 1;
                while (start >= 0) {
                    s1 = s1 + rev.charAt(start);
                    start--;
                }
                s1 = s1 + " "; // add space after word
                rev = ""; // reset for next word
            }
        }
        int start = rev.length() - 1;
        while (start >= 0) {
            s1 = s1 + rev.charAt(start);
            start--;
        }
        return s1.replaceAll("\\s+", " ").trim();
    }
}