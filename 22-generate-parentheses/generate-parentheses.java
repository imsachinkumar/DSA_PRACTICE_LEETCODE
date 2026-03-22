class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>arraylist=new ArrayList<>();
        int op=0,cl=0;
        String ans="";
        generate(op,cl,ans,n,arraylist);
        return arraylist;
    }
    public static void generate(int op,int cl,String ans,int n,List<String>arraylist)
    {

//        base case
        if(op==n && cl==n)
        {
            //System.out.println(ans);
            arraylist.add(ans);
            return;
        }
        if(op<n)
        {
            generate(op+1,cl,ans+"(",n,arraylist);
        }
        if(cl<op){
            generate(op,cl+1,ans+")",n,arraylist);
        }
    }
}