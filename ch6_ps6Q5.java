//write a java program to reverse an array

public class ch6_ps6Q5 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int n = Math.floorDiv(arr.length,2);
        int l = arr.length;
        int temp;

        for(int i=0; i<n; i++){
            //swap arr[i] and arr[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for(int element: arr){
            System.out.println(element);
        }

    }
}
