import java.util.Scanner;
public class loop_sumof_n_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no=");
        int n=sc.nextInt();
       int counter=1;
       int sum=0;
       while (counter<=n){
           sum=counter+sum;
           counter=counter+1;


       }
        System.out.println(sum );

    }
}
