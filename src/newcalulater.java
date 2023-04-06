import java.util.Scanner;
public class newcalulater {
    public static void main(String[] args) {
//        System.out.println("hello world");
       Scanner sc= new Scanner(System.in);
        System.out.println("first number");
        int a =sc.nextInt();
       // float a =sc.nextFloat();
        System.out.println("second number");
        int b =sc.nextInt();
        int sum=a+b;
       // float b =sc.nextFloat();
       // float sum=a+b;
        System.out.println("the sum of this question");
        System.out.println(sum);
        System.out.println("to show this is true or false:");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        String str= sc.next();
      //  String str= sc.nextLine();
        System.out.println(str);

    }
}


