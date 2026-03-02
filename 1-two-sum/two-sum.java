class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int idx=target-nums[i];
           if(hp.containsKey(idx)){
            return new int[]{hp.get(idx),i};
            
           }
           hp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}