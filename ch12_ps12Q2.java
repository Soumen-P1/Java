
import java.util.Scanner;

class C{
    public void print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give some feedback");
        String a  = sc.next();

        System.out.println(a);
    }
}

public class ch12_ps12Q2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.print();
    }


}
