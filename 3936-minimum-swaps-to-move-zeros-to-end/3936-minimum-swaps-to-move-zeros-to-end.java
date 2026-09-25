class Solution {
    public int minimumSwaps(int[] nums) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                i++;
            }
        }

        int count = 0;
        for (int j = 0; j < i; j++) {
            if (nums[j] == 0) {
                count++;
            }
        }

        return count;
    }
}