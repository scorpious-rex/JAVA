import java.util.*;
public class sumloop {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int sum=0;
//        for(int b=1; b<=a; b++){
//            sum+=b;
//        }
//        System.out.println(sum);

        int b=1;
        while(b<=a){
         sum+=b;
         b++;
        }
        System.out.println(sum);
    }
}
