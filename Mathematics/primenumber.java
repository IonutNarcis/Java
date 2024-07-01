//Prime number which is divisible by 1 and itself 
//eg 2 3 5 7 

//simple program
class HelloWorld {
    public static void main(String[] args) {
        int n=5;
        primenumber(n);
    }
    static void primenumber(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("The number is not prime");
                return;
            }
        }
    System.out.println("The number is prime");
    return;
       
    }
}


# The complexity is n 
# we can convert it into root of n
# The loop is allowed to run till sqrt of n--> if 36 then it runs till 6 which is the sqrt of 36 
# c <= sqrt(36) squaring on both the sides then we get c*c<=36
  so the while loop run accordingly



class HelloWorld {
    public static void main(String[] args) {
        int n=20;
        for(int i=0;i<=n;i++){
            System.out.println(i+" "+primenumber(i));
        }
        
    }
    static boolean primenumber(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
       
       
    }
}





Still more optimised way is also present
  SEIVE OF ERISTHOTHANAS
# elimimate the multiple of 2 and 3
# lets take a array boolean. 
# Let the val that is prime is false and the composite be true
Step 1 of sieve of erasthothenes
  * Get a number till which u need to know the prime number
  * Create a boolean array of the size n+1 since we need to avoid zero based indexing shows the auxillary space of n+1
  *pass the number and the boolean array








class HelloWorld {
    public static void main(String[] args) {
        int n=47;
        boolean[] arr = new boolean[n+1];
        Seive(n,arr);
        
    }
    static void Seive(int n,boolean[] arr){
        
       for(int i=2;i*i<=n;i++){
           if(!arr[i]){
               for(int j=i*2;j<=n;j+=i){
                   arr[j]=true;
               }
           }
       }
       for(int i=2;i<=n;i++){
           if(!arr[i]){
               System.out.println(i);
           }
       }}
}


Space complexity - O(n+1)
Time  complexity- O(n*log(log n))
