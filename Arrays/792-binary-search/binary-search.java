class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(target == nums[mid]){
                ans = mid;
                return ans;
            }
            else if(target < nums[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
}