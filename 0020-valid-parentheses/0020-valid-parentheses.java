class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        while (true) {
            String newS = s.replace("()", "")
                           .replace("{}", "")
                           .replace("[]", "");
            
            if (newS.equals(s)) {
                break;
            }
            
            s = newS;
        }
        
        return s.isEmpty();
    }
}
