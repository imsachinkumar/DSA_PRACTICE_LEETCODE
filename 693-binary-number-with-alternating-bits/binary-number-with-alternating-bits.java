class Solution {
    public boolean hasAlternatingBits(int n) {
        String ans=Integer.toBinaryString(n);
        for(int i=1;i<ans.length();i++){
            if(ans.charAt(i)==ans.charAt(i-1)) return false;
        }
        return true;
    }
}