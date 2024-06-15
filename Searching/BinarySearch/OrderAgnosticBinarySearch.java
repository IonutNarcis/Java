// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,9,10,15,17,19,120,167};
        int target = 17;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
        
    }
// When we are not sure whether the array is ascending or descending order
    static int binarysearch(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        boolean isAs = arr[low]<arr[high];
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAs){
               if(target<arr[mid]){
                high= mid-1;
                 }
            else {
                low =  mid+1;
            }}
            else{
                if(target > arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            }
            
        
        return -1;
        
    }
}
}
