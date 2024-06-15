// 1095 leetcode
// https://leetcode.com/problems/find-in-mountain-array/description/
// find the peak element 
//search the left side 
// if element search in the left side
class HelloWorld {
    //find the position of the element in the infinte array 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int a = ans(arr,target);
        System.out.println(a);
        
    }
    static int ans(int[] arr,int target){
        int peak = peake(arr);
        int firstt = orderagnostic(arr,target,0,peak);
        if(firstt!=-1){
            return firstt;
        }
        else return orderagnostic(arr,target,peak+1,arr.length-1);
        
    }
    static int peake(int[] arr){
        int low = 0;
        int high= arr.length-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(arr[mid] > arr[mid+1]){
                high=mid;
            }else{
                low= mid+1;
            }
        }
        return low;
    }

    static int orderagnostic(int[] arr,int target,int low,int high){
        boolean isA = arr[low]<arr[high];
        while(low<=high){
            int mid = low+(high-low)/2;
            if(target<arr[mid]){
                high= mid-1;
                 }
            if(isA){
            if(target > arr[mid]){
                low =  mid+1;
            }
            else
            {
                return mid;
            }}
            else{
                if(target>arr[mid])
                {
                high =  mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            
            }
            

        return -1;
        
    }
}
