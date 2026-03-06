class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int difference=Integer.MAX_VALUE;
        int closet=0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;


            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];

                if(sum==target) return sum;

                if(Math.abs(sum-target)<difference){
                    difference=Math.abs(sum-target);
                    closet=sum;
                }
                if(target>sum){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return closet;

    }
}