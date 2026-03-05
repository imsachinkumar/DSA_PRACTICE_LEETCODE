class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left=i+1;
            int right=nums.length-1;
            int sum=-nums[i];

            while(left<right){
                int new_sum=nums[left]+nums[right];
                if(new_sum==sum){
                    ll.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<nums.length && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>=0 && nums[right]==nums[right+1]){
                        right--;
                    }
                }else if(new_sum<sum){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return ll;
    }
}