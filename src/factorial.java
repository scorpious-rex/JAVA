import java.util.*;
public class factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum = 0;
        for(int n = 1; n<=i; n++){
            sum+=n;
        }
        System.out.println(sum);
    }
}
