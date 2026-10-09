class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {

            List<Integer> temp = new ArrayList<>();

            int result = 1;
            temp.add(result);

            for (int col = 1; col < row; col++) {
                result = result * (row - col) / col;
                temp.add(result);
            }

            ans.add(temp);
        }

        return ans;
    }
}
