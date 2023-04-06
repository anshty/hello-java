import java.util.Scanner;
/*wap to find the given age is a child teenager adult or old.*/
public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        if (age <=11) {
            System.out.println("child");
        } else if (age >= 12 && age <= 18) {
            System.out.println("teenager");
        } else if (age >= 19 && age <= 30)
        {
            System.out.println("adult");
        }else {
            System.out.println("old");
        }

    }
}