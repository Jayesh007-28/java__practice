// public class ScoundsamallestandLargestNum {

//     static void Secound_Min_Max_Element (int arr[]){

//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 int temp;
//                 if(arr[i]>arr[j]){
//                     temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }

//         // Arrays.sort(arr);

//         int Secound_samllest = arr [1];
//         int Secound_largest  = arr[arr.length - 2];
        
//         System.out.println("Secound samllest elemet is :"+Secound_samllest);
//         System.out.println("Secound Largest element is :"+Secound_largest);

//     }
//     public static void main(String[] args) {
//         int [] arr = {50,20,30,10,40};

//         Secound_Min_Max_Element(arr);
//     }
// }

// public class ScoundsamallestandLargestNum {
//     public static void main(String[] args) {
//         int [] arr = {50,20,30,10,40};

//         int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;

//         for(int i=0;i<arr.length;i++){
//             if(max1<arr[i]){
//                 max2=max1;
//                 max1=arr[i];
//             }else if(max2<arr[i] && arr[i] != max1){
//                 max2=arr[i];
//             }
//         }
//         System.out.println("Largest : "+max1);
//         System.out.println("Secound Largest : "+max2);
//     }
// }

public class ScoundsamallestandLargestNum {
    public static void main(String[] args) {
        int [] arr = {50,20,30,10,40};

        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(min1>arr[i]){
                min2=min1;
                min1=arr[i];
            }else if(min2>arr[i] && arr[i] != min1){
                min2=arr[i];
            }
        }
        System.out.println("Smallest : "+min1);
        System.out.println("Secound smallest : "+min2);
    }
}