class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int rem = 0;
        int y = x;
        if (x < 0)
            return false;
        while(y!=0){
            rem = y%10;
            rev = rev*10 + rem;
            y = y/10;
        }
        return x == rev;
    }
}