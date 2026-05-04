class twosum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>sum=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=target-nums[i];
            if(sum.containsKey(num)){
                return new int[]{sum.get(num),i};
            }
            sum.put(nums[i],i);
        }
        return new int[] {};
    }
}