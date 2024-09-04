//recursive function to to calculate sum of n natural numbers

public class ch7_ps7Q3 {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(10));;

    }
}
