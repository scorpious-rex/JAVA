import java.util.Scanner;
class first{
    public static void name1(String a){
        System.out.print(a+" ");

    }
}

    class secoend {
        public static void name2(String b) {
            System.out.print(b+" ");
        }
    }
        class third {
            public static void name3(String c) {
                System.out.print(c+" ");
            }
        }
public class function{
            public static void main() {
                System.out.println("Enter your First name");
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                System.out.println("Enter your middle name");
                String m = sc.nextLine();
                System.out.println("enter your last name");
                String v = sc.nextLine();

                first l= new first();
                l.name1(s);

                secoend x= new secoend();
                x.name2(m);

                third j= new third();
                j.name3(v);



}
}
