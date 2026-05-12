class Solution {
    int majorityElement(int arr[]) {
        // code here
        int count =0, item = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i: arr){
            
            map.put(i, map.getOrDefault(i, 0)+1);
            
            if(count == 0) item = i;
            
            if(item == i) count++;
            
            else count--;
            
            if(count > arr.length/2) return i;
        }
        
        if(map.get(item) > arr.length/2) return item;
        
        return -1;
    }
}

