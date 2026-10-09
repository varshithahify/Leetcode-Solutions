import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        long result = 1;
        ans.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            result = result * (rowIndex + 1 - i) / i;
            ans.add((int) result);
        }

        return ans;
    }
}