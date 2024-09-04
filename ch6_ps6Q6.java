//write a java program to find the maximum element in an array

public class ch6_ps6Q6 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,550};
        int max = 0;
        for(int e: arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println(max);

//        Question 7
        int [] arr1 = {10,20,30,40,550};
        int min = Integer.MAX_VALUE;
        for(int e: arr1){
            if(e<min){
                min=e;
            }
        }
        System.out.println(min);

    }
}
