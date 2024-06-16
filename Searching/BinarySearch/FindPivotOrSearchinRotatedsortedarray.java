//https://leetcode.com/problems/search-in-rotated-sorted-array/?source=submission-noac
class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivot1(nums);
        if(pivot ==-1){
            return bs(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target >= nums[0]){
            return bs(nums,target,0,pivot-1);
        }
        return bs(nums,target,pivot+1,nums.length-1);
        
    }
    static int pivot1(int[] arr){
        int low = 0;
        int high= arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid < high && arr[mid] > arr[mid+1]){
                return mid;
            }else if(mid > low && arr[mid] <arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[low]){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    static int bs(int[] arr,int target,int low,int high){
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if(target<arr[mid]){
                high= mid-1;
                 }
            else if(target > arr[mid]){
                low =  mid+1;
            }
            else
            {
                return mid;
            }
        }

        return -1;
        
    }
}
