public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        
        for(int i=1;i<=n-1;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(n==sum){
            System.out.println("Number is perfect number");
        }else{
            System.out.println("Number is not perfect number");
        }
    }
}
