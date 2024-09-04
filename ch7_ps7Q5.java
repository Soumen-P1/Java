//recursive function to print nth number of fibonacci series

public class ch7_ps7Q5 {
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fib(7));

    }
}
