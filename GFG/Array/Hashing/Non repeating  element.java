class Solution {
    public int firstNonRepeating(int[] arr) {
        
         HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i< arr.length; i++){
            int a= arr[i];
            map.put(a, map.getOrDefault(a,0)+1);
        }
        for(int j=0; j< arr.length;j++){
            int b= arr[j];
            if(map.get(b)==1){
                return b;
            }
        }return 0;
    }
}