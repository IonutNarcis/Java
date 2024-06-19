class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long low=0,high=x,ans=0,mid=0;
		while(low<=high){
		    mid = low +(high-low)/2;
		    if(mid*mid == x){
		        return mid;
		    }
		    else if(mid*mid < x){
		        low = mid+1;
		        ans = mid;
		    }
		    else{
		        high=mid-1;
		    }
		    
		    }
		    return ans;
	 }
}
