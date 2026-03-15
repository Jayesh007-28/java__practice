// public class GCDofNumber {
//     public static void main(String[] args) {
//         int a = 12 , b = 18;
//         int gcd = 1;

//         for(int i=1;i<=a&&i<=b;i++){
//             if(a%i==0 && b%i==0){
//                 gcd=i;
//             }
//         }
//         System.out.println(gcd);
//     }
// }

import java.util.Scanner;

public class GCDofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = b;i>=1;i--){
            if(a%i==0 && b%i==0){
                System.out.println("GCD : "+i);
                break;
            }
        }
        sc.close();
    }
}