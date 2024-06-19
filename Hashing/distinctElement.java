import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       int[] arr = {10,20,30,40,10};
       printdis(arr);
       countdis(arr);

   }
   static void printdis(int[] arr){
       HashSet<Integer> h = new HashSet<Integer>();
       for(int i=0;i<arr.length;i++){
           if(h.contains(arr[i])==false){
               System.out.println(arr[i]);
               h.add(arr[i]);
           }
       }
   }
   static void countdis(int[] arr){
       HashSet<Integer> h = new HashSet<Integer>();
       for(int i=0;i<arr.length;i++){
           h.add(arr[i]);
       }
       System.out.print("The count is : ");
       System.out.println(h.size());
   }
}
