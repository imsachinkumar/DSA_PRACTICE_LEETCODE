class Solution {
    public int reverse(int x) {
        long y=0;
        while(x!=0){
            long last=x%10;
            y=y+last;
            y=y*10;
            x=x/10;
        }
        y=y/10;
        if(y>Integer.MAX_VALUE || y<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*y);
        }
        return (int)y;
        
    }
}