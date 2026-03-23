// import java.util.Arrays;
// import java.util.Scanner;

// public class RotateArraybyKelements {

//     static void Rotate (int arr[],int k){
//         int n = arr.length;
//         k = k % n;

//         for(int i=0;i<k;i++){
//             int first = arr[0];

//             for(int j=0;j<n-1;j++){
//                 arr[j] = arr[j+1];
//             }

//             arr[n-1] = first;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter K :");
//         int k = sc.nextInt();
//         int [] arr = {10,20,30,40,50};

//         Rotate(arr, k);
//         sc.close();
        
//     }
// }

import java.util.Arrays;
import java.util.Scanner;

public class RotateArraybyKelements {

    static void Rotate(int arr[],int k){
        int n = arr.length;
        k = k%n;

        for(int i=0;i<k;i++){
            int first = arr[0];

            for(int j=0;j<n-1;j++){
                arr[j] = arr[j+1];
            }

            arr[n-1] = first;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {6 ,4, 10, 2, 18, 14};

        System.out.println("Enter K : ");
        int k = sc.nextInt();

        Rotate(arr, k);
        sc.close();

    }
}