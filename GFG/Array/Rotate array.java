class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        ArrayList<Integer> li = new ArrayList<Integer>();
        d = d % arr.length;
        for (int i = d;i<arr.length;i++){
            li.add(arr[i]);
        } for (int i = 0;i<=d-1;i++){
            li.add(arr[i]);
        } for (int i =0;i<arr.length;i++){
            arr[i]= li.get(i);
        }
    }
}   