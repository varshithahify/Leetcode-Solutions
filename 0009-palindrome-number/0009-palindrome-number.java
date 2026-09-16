class Solution {
    public boolean isPalindrome(int x) {
        boolean isPalind=true;
        int original=x;
        int Palindrome=0;

        if (x < 0) {
            return false;
        }

        while (x != 0) {
            int digit = x % 10;
            Palindrome = Palindrome * 10 + digit;
            x = x / 10;
        }
        return original==Palindrome;
    }
}