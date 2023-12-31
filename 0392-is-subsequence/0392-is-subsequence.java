class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int cur = 0;
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(cur) == t.charAt(i)){
                cur++;
                if(s.length() == cur){
                    break;
                }
            }
        }
        return s.length() == cur;
    }
}