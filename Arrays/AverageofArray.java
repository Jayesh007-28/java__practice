public class AverageofArray {

    static double avgArray(int arr[]){
        double avg = 0,sum=0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        avg = sum/n;
        return avg;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};

        double res = avgArray(arr);
        System.out.println("Average of array : "+res);
    }
}
