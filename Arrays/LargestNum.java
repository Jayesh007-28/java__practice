public class LargestNum {

    static int LargestElement(int arr[]){
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {20,40,50,30,10};
        int res = LargestElement(arr);
        System.out.println("Largest element in array : "+res);
    }
}
