Square root of the number using the binary search method

Binary search method

  class HelloWorld {
    public static void main(String[] args) {
        int n=47;
        Sqrtforperfectsqrt(n);
        
    }
    static void Sqrtforperfectsqrt(int n){
        int start =0;
        int end =n;
        int mid=0;
        while(start<end){
            mid = start+(end-start)/2;
            if(mid*mid >=n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }}
        System.out.println(mid);
        
    }
}




The mid has the final answer of this and this is only for the perfect square

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int n=40;
        //precision
        int p=3;
        Sqrtforperfectsqrt(n,p);
        
    }
    static void Sqrtforperfectsqrt(int n,int p){
        int start =0;
        int end =n;
        int mid=0;
        while(start<end){
            mid = start+(end-start)/2;
            if(mid*mid >=n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }}
       double root=end; //  end = 6 and start = 7
       double incr=0.1;//6.1 
       for(int i=0;i<p;i++){
           while(root*root<=n){ //6.3*6.3 <=n and it increment to 6.4 but it is not the answer when the loop break the value is decremented
               root+=incr;//6.1
           }
           root-=incr;//it goes till 6.4 -0.1;
           incr/=10;
       }
       System.out.println(root);
        
    }
}









WORLDS FASTEST METHOD TO FIND THE SQUARE ROOT

NEWTON RAPHSON METHOD
Formula
  
  root = sqrt(x+(n/x))/2

class HelloWorld {
    public static void main(String[] args) {
        int n=40;
        NewtonRaphsonSqrt(n);
        
    }
    static void NewtonRaphsonSqrt(int n){
        double x = n;
        double root=0.0;
        while(true){
            root = 0.5 *(x + (n/x));
            if(Math.abs(root-x) <0.1){
                break;
            }
            x=root;
        }
        System.out.println(root);
        
    }
}
