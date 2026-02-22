class Solution {
    public String reverseWords(String s) {
        String[]arr=s.split(" ");
        String[]arr1=new String[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            arr1[j]=sb.reverse().toString();
            j++;
        }
       return String.join(" ",arr1);
    }
}