class Solution {
    public void moveZeroes(int[] nums) {
        int idx=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[idx]=nums[i];
                idx++;
            }
        }
        for(int k=idx;k<nums.length;k++){
            nums[k]=0;
        }
        
        
    }
}