//create an array of 5 floats and calculate their sum

public class ch6_ps6Q1 {
    public static void main(String[] args) {
        float [] num = {100.2f,50,40,30,10};
//        float sum = num[0]+num[1]+num[2]+num[3]+num[4];

//        System.out.println(sum);
        float sum = 0;
        for(float element: num){
            sum = sum+element;
        }
        System.out.println(sum);
    }
}
