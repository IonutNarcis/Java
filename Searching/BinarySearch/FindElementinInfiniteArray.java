class HelloWorld {
    //find the position of the element in the infinte array 
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,9,8,9,27,29,30,34,36,37};
        int target = 29;
        int a = ans(arr,target);
        System.out.println(a);
        
    }
    static int ans(int[] arr,int target){
        int start =0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end = end +(end - start +1)*2;
            start = temp;
            System.out.println(start);
        }
        return binarysearch(arr,target,start,end);
    }

    static int binarysearch(int[] arr,int target,int low,int high){
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
