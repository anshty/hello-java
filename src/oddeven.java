import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no:");
        int no=sc.nextInt();
        int a=no%2;
        System.out.println(a);
        if (2==2){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
