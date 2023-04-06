import java.util.Scanner;
public class percentage_subject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float m,e,s,ssc,hi;
        System.out.println("Enter your Maths Number-");
        m = sc.nextFloat();
        System.out.println("Enter your English Number-");
        e = sc.nextFloat();
        System.out.println("Enter your Science Number-");
        s = sc.nextFloat();
        System.out.println("Enter your Social Science Number-");
        ssc = sc.nextFloat();
        System.out.println("Enter your Hindi Number-");
        hi = sc.nextFloat();
        float total=m+e+s+ssc+hi;
        float per=total/5;
        System.out.println("Total Marks-"+total);
        System.out.println("Total Percentage-"+per);
    }
}
