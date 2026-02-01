import java.util.*;
public class InverseOfNumber {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
            int lastdigit= a%10;
            System.out.print(lastdigit);
            a/=10;
        }
        System.out.println();
    }
}
