class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] neg = new int[nums.length];
        int[] pos = new int[nums.length];

        int n = 0;
        int p = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= 0){
                neg[n++] = nums[i] * nums[i];
            } else {
                pos[p++] = nums[i] * nums[i];
            }
        }

        // reverse negative squares
        int l = 0, r = n - 1;
        while(l < r){
            int temp = neg[l];
            neg[l] = neg[r];
            neg[r] = temp;
            l++;
            r--;
        }

        int i = 0, j = 0, idx = 0;
        int[] merge_array = new int[nums.length];

        while(i < n && j < p){
            if(neg[i] <= pos[j]){
                merge_array[idx++] = neg[i++];
            } else {
                merge_array[idx++] = pos[j++];
            }
        }

        while(i < n){
            merge_array[idx++] = neg[i++];
        }

        while(j < p){
            merge_array[idx++] = pos[j++];
        }

        return merge_array;
    }
}