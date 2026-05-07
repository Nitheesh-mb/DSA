class Solution {
    public int getSecondLargest(int[] arr) {
        int max = -1;
        int secondLargest = -1;
        
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                secondLargest = max;
                max = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i]<max)
            {
                secondLargest = arr[i];
            }
        }
      
      return secondLargest;  
    }
}