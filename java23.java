import java.util.Scanner;

public class java23 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("N is prime ");

        }else{
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true) {
                System.err.println("n is prime");

            }else {
                System.out.println("n is not prime");
            }
        }

    }
    
}
