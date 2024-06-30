class HelloWorld {
    public static void main(String[] args) {
        int num=7;
        recursion(7);
    
    }
    static void recursion(int n){
        if(n<0){
            return ;
        }
        System.out.println(n);//prints first and then calls the other
        recursion(n-1);
    }
