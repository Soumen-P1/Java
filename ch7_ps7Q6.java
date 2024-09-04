//function to find average of a set of numbers passed as arguments

public class ch7_ps7Q6 {

    static void avg(int...arr){
        float k=0;
        for(int e: arr){
            k += e;

        }
        System.out.println(k/ arr.length);
    }
    public static void main(String[] args) {
            avg(1,2,3,4,100,250,80,33);
    }
}
