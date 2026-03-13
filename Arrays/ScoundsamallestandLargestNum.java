public class ScoundsamallestandLargestNum {

    static void Secound_Min_Max_Element (int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp;
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Arrays.sort(arr);

        int Secound_samllest = arr [1];
        int Secound_largest  = arr[arr.length - 2];
        
        System.out.println("Secound samllest elemet is :"+Secound_samllest);
        System.out.println("Secound Largest element is :"+Secound_largest);

    }
    public static void main(String[] args) {
        int [] arr = {50,20,30,10,40};

        Secound_Min_Max_Element(arr);
    }
}
