import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {5,3,2,-1};
        int sum=4;
        boolean ans = zerosubarray(arr,sum);
        System.out.println(ans);
    }
   
   static boolean zerosubarray(int[] arr,int sum){
        HashSet<Integer> h = new HashSet<>();
        int ps = 0;
        for(int i=0;i<arr.length;i++){
            ps+=arr[i];
            if(ps == sum){
                //see if the  prefix sum is directly equal to the asked sum
                return true;
            }
            if(h.contains(ps-sum)){
                // if the prefix sum - the entire sum result the value in the hashset then true
                // 5 8 10 9
                return true;
            }
            h.add(ps);
            }
    return false;
    }
}
