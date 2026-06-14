class Solution {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
     
        int left = l;
        int right = r;
        while(left < right){
            int temp = arr.get(left-1);
            arr.set(left-1 , arr.get(right-1));
            arr.set(right-1 , temp);
            left++;
            right--;
        }
        return arr;
    }
}