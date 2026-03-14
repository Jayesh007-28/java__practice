public class PalindromeNumberRange {

    static void Palindrome(int n) {
        int temp = n , rev = 0 , id;

        while(n>0){
            id = n % 10;
            rev = (rev * 10) + id;
            n /= 10;
        }
        if(temp == rev ){
            System.out.print(rev + " ");
        }
    }
    public static void main(String[] args) {
        int a = 100 , b = 200;

        for(int i=a;i<=b;i++){
            Palindrome(i);
        }
    }
}
