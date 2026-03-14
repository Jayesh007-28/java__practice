public class ArmStrongNumber {
    static boolean ArmStrong (int n){
        int k = String.valueOf(n).length();
        int sum = 0;
        int num = n;

        while(n>0){
            int id = n % 10;
            sum += Math.pow(id, k);
            n /= 10;
        }
        if(sum==num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 153;
        if(ArmStrong(n)){
            System.out.println("Number is ArmStrong Number.");
        }else{
            System.out.println("Number is not armstrong Number.");
        }
    }
}
