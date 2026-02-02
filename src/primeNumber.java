import java.util.*;
public class primeNumber {
    static void main() {
        while (true) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean isPrime = true;
//        for (int i = 2; i<=n-1; i++){
//            if( n % i == 0){
//                isPrime=false;
//            }
//        }
//        if(isPrime==true){
//            System.out.println(n +" "+ "is a prime Number");
//        }else{
//            System.out.println(n +" "+ "is not Prime Number");
//        }

//        to optimise the code for a big number ---

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime = true) {
                System.out.println(n + " " + "is a prime Number");
            } else {
                System.out.println(n + " " + "is not prime Number");
            }
        }
    }
}