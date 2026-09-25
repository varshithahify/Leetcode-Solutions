class Solution {
    public int maxOperations(String s) {

        int ones = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                ones++;
            }

            else if (i > 0 && s.charAt(i - 1) == '1') {
                count += ones;
            }
        }

        return count;
    }
}