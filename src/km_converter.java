import java.util.Scanner;
public class km_converter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("kilometre");
        float km=sc.nextFloat();
        System.out.println("In miles");
     double mile=km*0.62137;
        System.out.println(mile);

    }
}
