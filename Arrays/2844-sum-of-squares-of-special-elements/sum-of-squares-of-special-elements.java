class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum_of_squares = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum_of_squares += nums[i - 1] * nums[i - 1];
            }
        }

        return sum_of_squares;
    }
}