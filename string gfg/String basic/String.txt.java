String is a sequence of characters
In java string can be created in four ways

1.char[] arr = {g,e,e,k,s};

2.String str ="Geeks"; //immutable
        or
String str = new String("Geeks"); 

3.StringBuffer s = new StringBuffer("Geeks");   // multithreaded environment and mutable

4.StringBuilder s = new StringBuilder("Geeks"); // single threaded environment and immutable




class HelloWorld {
    public static void main(String[] args) {
       String str = "Geeks";
       System.out.println(str.length());
       System.out.println(str.charAt(3));
       System.out.println(str.substring(3));
       System.out.println(str.substring(0,3));
        String str1 = "Geeks";
        if(str==str1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String str2 = new String("Geeks");
        if(str==str2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        str1= str1+"ForGeeks";
        System.out.println(str1==str);
        //method
        // contains , equals, compareTo indexOf
        System.out.println(str.contains(str));  confirms
        System.out.println(str.equals(str2));   compare
        System.out.println(str.compareTo(str2));   lexicographically
        System.out.println(str1.indexOf(str2));    
        
        
    }
}

output
5
k
ks
Gee
Yes
No
false
true
true
0
0








