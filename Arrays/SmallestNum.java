public class SmallestNum {
    
    static int SmallestElement(int arr[]){
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr = {50,20,40,30,10};
        int res = SmallestElement(arr);

        System.out.println("Smallest element in array : "+res);
    }
}