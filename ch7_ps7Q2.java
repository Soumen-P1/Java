//  *
//  *   *
//  *   *   *
//  *   *   *   *

public class ch7_ps7Q2 {
    static void star(){
        char str = '*';
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(str+" ");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        star();

    }
}
