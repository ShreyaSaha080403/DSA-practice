class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Concatenate s with itself
        String concatenated = s + s;
        
        // Check if goal is a substring of the concatenated string
        return concatenated.contains(goal);
    }
}