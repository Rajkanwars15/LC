class Solution {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        int i = 0;
        int j = a.length()-1;
        while(i<=j){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}