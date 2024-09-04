//write a java program to find whether an array is sorted or not

public class ch6_ps6Q8 {
    public static void main(String[] args) {
        int [] arr = {100,250,30,40,550};

        boolean isSorted = true;
        for(int i=0; i< arr.length-1 ;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }

    }
}
