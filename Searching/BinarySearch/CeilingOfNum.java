class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,9,10,15,17,19,120,167};
        int target = 18;  // smallest greater number after the target 
        int ans = binarysearch(arr,target);
        System.out.println(ans);
        
    }

    static int binarysearch(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
           
            else if(target<arr[mid]){
                high= mid-1;
                 }
            else {
                low =  mid+1;
            }
            
            }
            

        return low;
        
    }
}

output: 9
