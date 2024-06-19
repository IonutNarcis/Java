import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {5,3,2,-1,-1};
        countFre(arr);
        
    }
   //count frequency
   static void countFre(int[] arr){
       HashMap<Integer,Integer> h = new HashMap<>();
       for(int val:arr){
           h.put(val,h.getOrDefault(val,0)+1);
       }
       for(Map.Entry<Integer,Integer> e: h.entrySet()){
           System.out.println(e.getKey()+" "+e.getValue());
       }
   }
}
