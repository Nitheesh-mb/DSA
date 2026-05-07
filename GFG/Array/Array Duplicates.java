class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();
        for(int val : arr){
            if(s.contains(val)){
                res.add(val);
            }
            s.add(val);
        }
        return res;
    }
}
