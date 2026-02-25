class Solution {
    public char repeatedCharacter(String s) {
        Set<Character>st=new LinkedHashSet<>();
        for(char ch:s.toCharArray()){
            if(st.contains(ch)) return ch;
            st.add(ch);
        }
        return ' ';
        
    }
}