//write a java method to print a multiplication table

public class ch7_ps7Q1 {
    static void table(int a){
        int k;
        for(int i=1; i<=10; i++){
            k = i*a;
            System.out.print(k+" ");
        }

    }
    public static void main(String[] args) {
            table(5);
    }
}
