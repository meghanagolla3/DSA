class Solution {
    public String reverseVowels(String s) {
        char[] charray = s.toCharArray();
        int st = 0;
        int end = s.length()-1;
        while(st < end){
            while(st<end&&(charray[st]!='A'&&charray[st]!='E'&&charray[st]!='I'&&charray[st]!='O'&&charray[st]!='U'&&charray[st]!='a'&&charray[st]!='e'&&charray[st]!='i'&& charray[st]!='o'&&
                    charray[st]!='u')) {
                st++;
            }
            while(st<end&&(charray[end]!='A'&&charray[end]!='E'&&charray[end]!='I'&&charray[end]!='O'&&charray[end]!='U'&&charray[end]!='a'&&charray[end]!='e'&&charray[end]!='i'&&charray[end]!= 'o'&&charray[end]!='u')){
                end--;
            }
            char temp = charray[st];
            charray[st] = charray[end];
            charray[end] = temp;
            st++;
            end--;
        }
        return new String(charray);
    }
}