class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
}
//tc - O(1)
//sc - O(1)