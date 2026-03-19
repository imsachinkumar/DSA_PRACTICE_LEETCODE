class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> st=new HashSet<>();
        List<Integer> ll=new ArrayList<>();
        for(int ans : nums){
            st.add(ans);
        }
        for(int i=1;i<=nums.length;i++){
            if(!st.contains(i)){
                ll.add(i);
            }
        }
        return ll;
        
    }
}