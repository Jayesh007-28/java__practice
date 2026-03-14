public class PalindromeNum {
    public static void main(String[] args) {
        int num = 122;
        int temp = num ,rev = 0;

        while (num>0) {
            int id = num % 10;
            rev = (rev * 10)+id;
            num/=10;
        }
        if(temp == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}