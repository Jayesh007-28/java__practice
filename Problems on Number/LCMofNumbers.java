import java.util.Scanner;

public class LCMofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b){
            int temp = a;
            a=b;
            b=temp;
        }

        for(int i=a;i<=a*b;i+=a){
            if(i%b==0 && i%a==0){
                System.out.println("Lcm :"+i);
                break;
            }
        }
        sc.close();
    }
}
