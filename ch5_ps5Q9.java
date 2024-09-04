//write a program to calculate the sum of the numbers occurring in the multiplication table of 8

public class ch5_ps5Q9 {
    public static void main(String[] args) {
        int n=8;
        int k=0;
        for(int i=1; i<=10; i++){
            k = k+(i*n);


        }
        System.out.println(k);
    }
}
