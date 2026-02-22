class Solution {
    public boolean isPrime(int n){
        int cnt=0;
        if(n<=1) return false;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt>1) return false;
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        
        int final_ans=0;
        while(left<=right){
            int count=0;
            String ans=Integer.toBinaryString(left);
            for(int i=0;i<ans.length();i++){
                if(ans.charAt(i)=='1'){
                    count++;
                }
            }
            if(isPrime(count)){
                    final_ans++;
                }
            left++;
        }
        return final_ans;
    }
}