class Solution {
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();

        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=i; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > n/3){
                if(al.size()==0 || arr[i] != al.get(0)){
                    al.add(arr[i]);
                }
            }
            if(al.size() == 2){
                if(al.get(1) < al.get(0)){
                    java.util.Collections.swap(al,0,1);
                
                }
                break;
            }
        }
        return al;
    }
}