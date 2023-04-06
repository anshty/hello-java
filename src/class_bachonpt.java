import java.util.Scanner;
public class class_bachonpt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your marks");
        int marks=sc.nextInt();
  if(marks<50){
      System.out.println("bad");
  }else if(marks>=50&&marks<70){
      System.out.println("good");
  }else if(marks>=70&&marks<80){
      System.out.println("very good");
  }else if(marks>=80&&marks<=100){
      System.out.println("excellent");
  }
    }
}
