public class PrimeNumberRange {

    static void Prime(int n){
        int cnt = 0;

        for(int i = 1;i <= n ;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt==2){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        int a = 100 , b = 150;

        for(int i=a;i<=b;i++){
            Prime(i);
        }
    }
}
