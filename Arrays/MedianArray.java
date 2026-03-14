import java.util.Arrays;

public class MedianArray {

    static void Median(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;

        if(n%2==0){
            int ind1 = (n/2)-1;
            int ind2 = (n/2);
            System.out.println("Median : "+(double)(arr[ind1]+arr[ind2])/2);
        }else{
            System.out.println("Median : "+(double)(arr[n/2]));
        }
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};

        Median(arr);
    }
}
