class Solution {
    public int removeDuplicates(int[] nums) {
        int result=1;
        int idx=1;
        int add=0;

        while(idx<nums.length){
            if(nums[idx]==nums[idx-1]){
                idx++;
                continue;
            }
            nums[add+1]=nums[idx];
            add++;
            result++;
            idx++;
        }
        return result;

    }
}