class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap <Integer, Integer> freq = new HashMap<>();
        for(int i= 0; i< arr.length; i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }else{
                freq.put(arr[i],1);
            }
        }
        List<Integer> li = new ArrayList<>();
        for(int i=1; i<=arr.length; i++){
            li.add(freq.getOrDefault(i,0));
            
        }
        return li;
    }
}
