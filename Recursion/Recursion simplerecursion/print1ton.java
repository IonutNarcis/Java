class HelloWorld {
    public static void main(String[] args) {
        int n=5;
        recursion1ToN(n);
    }
    static void recursion1ToN(int n){
        if(n==0){
            return;
        }
        recursion1ToN(n-1);
        System.out.println(n);
    }
}
