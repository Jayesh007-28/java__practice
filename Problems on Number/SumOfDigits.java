public class SumOfDigits {
    public static void main(String[] args) {
        int n= 523;
        int sum = 0;

        while(n>0){
            int id = n % 10;
            sum+=id;
            n/=10;
        }
        System.out.println("Sum of all digits are : "+sum);
    }
}
