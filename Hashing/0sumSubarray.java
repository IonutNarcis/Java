import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {4,-1,5,-5};
        boolean ans = zerosubarray(arr);
        System.out.println(ans);
    }
    // step 1 add 0+4 = 4
    //step 2 add 4-1 = 3 
    //step 3 add 3+5 = 8
    // step 4 add 8-5 = 3 
    // since 3 is already present the loops break denoting the presence of the 0  sum sub array in it
   static boolean zerosubarray(int[] arr){
        HashSet<Integer> h = new HashSet<>();
        int ps = 0;
        for(int i=0;i<arr.length;i++){
            ps+=arr[i];
            if(h.contains(ps)){
                return true;
            }
            if(ps==0){
                return true;
            }
            h.add(ps);
            }
    return false;
    }
}
