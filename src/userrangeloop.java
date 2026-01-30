import java.util.*;
public class userrangeloop{
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=1;
//        while(b!=11){
//            System.out.println(a+"x"+b+"="+a*b);
//            b++;
//        }


//        for(b=1; b<=10; b++){
//            System.out.println(a+"x"+b+"="+a*b);
//        }


        do{
            System.out.println(a+"x"+b+"="+a*b);
            b++;
        } while(b<=10);

    }

}
