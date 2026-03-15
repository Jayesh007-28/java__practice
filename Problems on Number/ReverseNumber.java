import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int rev = 0;

        if (n > 0) {
            while (n > 0) {
                int id = n % 10;
                rev = (rev * 10) + id;
                n = n / 10;
            }
            System.out.println("Reverse Number: " + rev);
        } 
        else {
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}