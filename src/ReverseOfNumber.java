import java.util.*;
public class ReverseOfNumber {
    static void main() {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int reverse = 0;
        while (a>0){
            int lastdigit=a%10;
            System.out.print(lastdigit);
            reverse = (reverse*10)+lastdigit;
            a/=10;
        }
        System.out.println();
    }
}
