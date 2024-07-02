Factors of 20 are 1 2 4 5 10 20
# BRUTE FORCE METHOD
  It is a method where it runs n time
  for(int i=1;i<=20;i++){
  if(n%i==0){
    print(i);
  }}

20%1 20*1=20
20%2 10*2=20
20%4 4*5=20  ] the sequence repeates so run sqrt times alone
20%5 5*4=20...
If the factor to be found in sqrt times


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int n=36;
        Factors(n);
        
    }
    static void Factors(int n){
    ArrayList<Integer> n1 = new ArrayList<Integer>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else{
                System.out.print(i +" "); //consider there are 6 factors they are stored as 1 6 2 5 3 4 where 6 5 4 are store in the array list in the 6 5 4 order so they are 
                n1.add(n/i); // printed in the reverese to match it in the sorted order
                  
                }
            }
        }
        for(int i=n1.size()-1;i>=0;i--){
            System.out.print(n1.get(i)+" ");
        }
        
    }
}



Prime factors of a  number

class HelloWorld {
    public static void main(String[] args) {
        int n=450;
        primefactors(n);
    }
    public static void primefactors(int n){
        if(n<=1){
            return;
        }
        while(n%2 == 0){
            System.out.println(2);
            n=n/2;
        }
        while(n%3==0){
            System.out.println(3);
            n=n/3;
        }
        for(int i=5;i*i <= n ;i+=6){
            while(n%i == 0){
                System.out.println(i);
                n=n/i;
            }
            while(n%(i+2) == 0){
                System.out.println(i);
                n=n/(i+2);
            }
        }
        if(n>3){
            System.out.println(n);
        }
    }
}
