class Solution {
    public int maxFrequencyElements(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int max = 0;
        for(int i = 0; i< arr.length; i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }else{
                freq.put(arr[i],1);
            }
            if(freq.get(arr[i])> max){
                max = freq.get(arr[i]);
            }
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> e: freq.entrySet()){
            if(max == e.getValue()){
                sum+=e.getValue();
            }
        }
        return sum;
    }
}