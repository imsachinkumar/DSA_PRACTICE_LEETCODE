class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        // String str="";
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='0'){
        //         str+='1';
        //     }else{
        //         str+='0';
        //     }
        // }
        // return Integer.parseInt(str,2);

        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                sb.setCharAt(i,'0');
            }else{
                sb.setCharAt(i,'1');
            }
        }
        String str=sb.toString();
        return Integer.parseInt(str,2);
    }
}

