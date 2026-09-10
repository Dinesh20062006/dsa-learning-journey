class Solution {
    public int[] searchRange(int[] arr, int target) {
        int l=0;
        int r=arr.length-1;
        int start=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target)
            {
                start=mid;
                r=mid-1;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        l=0;
        r=arr.length-1;
        int end=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target)
            {
                end=mid;
                l=mid+1;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return new int[]{start,end};
    }
}