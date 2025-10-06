import java.util.Arrays;
import java.util.List;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // List<Boolean> res = new ArrayList<>();
        Boolean[] res = new Boolean[candies.length];
        Arrays.fill(res, true);
        int max = 0;
        for(int i=0; i< candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i=0; i< candies.length; i++){
            if(candies[i] + extraCandies < max){
                // res.get(i) = true;
                res[i] = false;
            }
        }
        List<Boolean> res1 = Arrays.asList(res);
        return res1;
    }
}