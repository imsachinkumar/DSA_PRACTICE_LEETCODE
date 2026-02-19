class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int last=num.length-1;
        List<Integer>ll=new ArrayList<>();

        while(last>=0 || k>0){

            if(last>=0){
                k=k+num[last];
                last--;
            }
            ll.add(0,k%10);
        k=k/10;
        }
                return ll;

        
    }
    
}