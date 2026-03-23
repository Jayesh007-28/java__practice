public class PrimeNumArray {

    static boolean isPrime(int num){
        int cnt = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                cnt++;
            }
        }
        if(cnt==2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int [] arr= {13,20,10,5,7,11};
        int n = arr.length;
        int pc=0,sum=0;
        double avg=0;

        for(int i=0;i<n;i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i]+" ");
                pc++;
                sum+=arr[i];
                avg=sum/pc;
            }
        }
        System.out.println();
        System.out.println("Prime count : "+pc);
        System.out.println("Sum of all prime numbers : "+sum);
        System.out.println("Average : "+avg);
    }
}
