class Solution {
    public int[] sortedSquares(int[] nums) {
      
      int[]neg=new int[nums.length];
      int n=0;
      int[]pos=new int[nums.length];
      int p=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]<=0){
            neg[n++]=nums[i]*nums[i];
        }else{
            pos[p++]=nums[i]*nums[i];
        }
      }
      int i=0;
      int j=0;
      int idx=0;
      int[]merge_array=new int[nums.length];

      int l=0;
      int m=n-1;

      while(l<m){
        int temp=neg[l];
        neg[l]=neg[m];
        neg[m]=temp;
        l++;
        m--;

      }

      while(i<n && j<p){
        if(neg[i]<=pos[j]){
            merge_array[idx++]=neg[i++];
        }else{
        merge_array[idx++]=pos[j++];
        }
      }
      while(i<n){
        merge_array[idx++]=neg[i++];
      }
      while(j<p){
        merge_array[idx++]=pos[j++];
      }
      return merge_array;
    }
}