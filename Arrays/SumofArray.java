public class SumofArray {

    static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,100};

        int res = sum(arr);
        System.out.println("Sum of all array element : "+res);
    }
}
