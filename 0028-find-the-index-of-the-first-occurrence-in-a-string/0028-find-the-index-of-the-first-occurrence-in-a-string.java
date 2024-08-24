class Solution {
    public static boolean match(int i, String haystack, String needle){
        for(int j=0; j<needle.length(); j++){
            if(haystack.charAt(j+i) != needle.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length() || haystack.length()<1 || needle.length()<1){
            return -1;
        }
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i)==needle.charAt(0) && haystack.length()-i >= needle.length()){
                if(match(i,haystack,needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}