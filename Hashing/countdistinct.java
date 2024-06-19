// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {5,3,2,-1,-1};
        int sum= countdistinct(arr);
        System.out.println(sum);
        
    }
   //count distinct 
   static int countdistinct(int[] arr){
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            
            h.add(arr[i]);
            // no duplicates add so we can return the size
            }
    return h.size();
    }
    static int countdissimple(Integer arr[]){
        HashSet<Integer> h = new HashSet<>(Arrays.asList(arr));
        return h.size();
        
    }
}
