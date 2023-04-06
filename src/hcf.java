import java.util.Scanner;
public class hcf {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter n1:");
        int n1=sc.nextInt();
        System.out.println("enter n2:");
        int n2=sc.nextInt();


        while(n1%n2!=0){
            int sum=n1%n2;
            //System.out.println(sum);
            n2=n1;
            n2=sum;



        }
        System.out.println("divisor");
        System.out.println(n2);
    }
}
