import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("sakthi");
        h.add("Sowmya");
        System.out.println(h.contains("sakthi"));
        Iterator<String> i = h.iterator();
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }
          System.out.println(h.size());
          System.out.println(h.remove("sakthi"));
          System.out.println(h.isEmpty());
          // h.clear()
        
       
   }
}
