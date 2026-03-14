public class PrimeNumber {
    public static void main(String[] args) {
        int n = 31;
        int cnt=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt==2){
            System.out.println("Prime number");
        }else{
            System.out.println("Non prime number");
        }
    }
}
