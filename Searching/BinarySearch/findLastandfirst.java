//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr ={-1,-1};
        arr[0] = search(nums,target,true);
        if(arr[0]!=-1){
        arr[1] = search(nums,target,false);
        }
        return arr;
    }

int search(int[] nums,int target, boolean find){
    int ans =-1;
    int low=0;
    int high=nums.length-1;
    while(low<=high){
        int mid = low+(high-low)/2;
        if(target<nums[mid]){
                high= mid-1;
                 }
        else if(target>nums[mid]){
                low =  mid+1;
            }
        else{
                ans = mid;
                if(find){
                    high= mid-1;
                }
                else{
                    low= mid+1;
                }
            }
            
            }
            return ans;
}}
