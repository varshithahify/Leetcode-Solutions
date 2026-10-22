class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int xr = 0;
        for (int i = 0; i < n; i++) {
            xr = xr ^ nums[i];
            xr = xr ^ (i + 1);
        }
        int bitNo = 0;
        while ((xr & (1 << bitNo)) == 0) {
            bitNo++;
        }
        int zero = 0;
        int one = 0;

        for (int i = 0; i < n; i++) {
            if ((nums[i] & (1 << bitNo)) != 0) {
                one = one ^ nums[i];
            } else {
                zero = zero ^ nums[i];
            }
            if (((i + 1) & (1 << bitNo)) != 0) {
                one = one ^ (i + 1);
            } else {
                zero = zero ^ (i + 1);
            }
        }
        int count = 0;

        for (int num : nums) {
            if (num == zero) {
                count++;
            }
        }

        if (count == 2) {
            return new int[]{zero, one};
        }

        return new int[]{one, zero};
    }
}