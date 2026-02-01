import java.util.*;
public class primeNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i<=n-1; i++){
            if( n % i == 0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println(n +" "+ "is a prime Number");
        }else{
            System.out.println(n +" "+ "is not Prime Number");
        }
    }
}