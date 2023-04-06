import java.util.Scanner;
public class prime_nonprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no:");
        int n = sc.nextInt();
        int div=2;
        boolean flag=true;
        while(div<=n-1){
            if (n%div==0) {
                flag = false;
            } div=div+1;

            }if(flag==true){
            System.out.println("prime number");
        }else{
            System.out.println("non-prime number");
        }

    }
}
